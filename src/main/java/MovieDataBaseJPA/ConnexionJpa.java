package MovieDataBaseJPA;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.type.descriptor.sql.SqlTypeDescriptorRegistry.ObjectSqlTypeDescriptor;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import MovieDataBaseDTO.ActeurDto;
import MovieDataBaseDTO.FilmDto;
import MovieDataBaseDTO.GenreDto;

import MovieDataBaseDTO.LieuDto;
import MovieDataBaseDTO.PaysDto;
import MovieDataBaseDTO.RealisateurDto;
import MovieDataBaseDTO.RoleDto;

public class ConnexionJpa {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		// TODO Auto-generated method stub

		// Créer une instance d’entityManagerFactory
		// Créer une instance d’entityManager
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("moviesdatabase");
		EntityManager em = entityManagerFactory.createEntityManager();

		EntityTransaction transaction = em.getTransaction();

		/** cree une instance de ObjectMapper */
		ObjectMapper mapper = new ObjectMapper();

		/** formater date */
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-M-d");
		mapper.setDateFormat(formatter);

		CollectionType collType = mapper.getTypeFactory().constructCollectionType(List.class, FilmDto.class);

		List<FilmDto> films = mapper
				.readValue(new File("C:\\Users\\far23\\PremiersPasJava\\MovieDataBaseJPA\\films.json"), collType);

		// *****************films*****************//
		for (FilmDto f : films) {

			transaction.begin();
			// System.out.println(f);

			// instancie objet film
			Film film = new Film();

			// je set et recupere les donnees film
			film.setNom(f.getNom());
			film.setLangue(f.getLangue());
			film.setUrl(f.getUrl());
			film.setPlot(f.getPlot());

			em.persist(film);

			// *****************genre*****************//
			for (GenreDto g : f.getGenre()) {
				System.out.println(g.getNom());
				Genre genre = new Genre();
				genre.setLibelle(g.getNom());

				System.out.println("genre libelle de film " + g.getNom());
				// attention doublon genre voir jpa diapo 93 cmt rechercher une info requete
				// jpql
				// Objet type query

				em.persist(genre);
				film.getGenres().add(genre);// pour les array lists joinsTable objet film a plusieurs genre
			}

			// *****************Acteur*****************//
			for (ActeurDto a : f.getActeur()) {

				Acteur acteur = new Acteur();
				acteur.setIdentite(a.getIdentite());
				acteur.setLieuNaissance(a.getNaissance().getLieuNaissance());
				acteur.setDateNaissance(a.getNaissance().getDateNaissance());
				acteur.setTaille(a.getHauteur());

				em.persist(acteur);
				film.getActeurs().add(acteur);
			}

			// *****************Realisateur*****************//
			for (RealisateurDto r : f.getRealisateurs()) {

				Realisateur realisateur = new Realisateur();
				realisateur.setIdentite(r.getIdentite());
				realisateur.setUrl(r.getUrl());

				em.persist(realisateur);
				film.getRealisateurs().add(realisateur);
			}

			// *****************roles*****************//
			for (RoleDto ro : f.getRoles()) {
				Role role = new Role();
				role.setNomPersonnage(ro.getNom());
				//FAIRE Getacteur()
				  //problematique
				
				
				em.persist(role);
				film.getRoles().add(role);
				
				

			}

			// *****************tournage*****************//
			// ici condition
			if (f.getLieuTournageDto() != null) {
				Tournage tournage = new Tournage();
				tournage.setVille(f.getLieuTournageDto().getVille());
				tournage.setEtat(f.getLieuTournageDto().getEtatDept());
				em.persist(tournage);
				film.getTournages().add(tournage);
			}

			// *****************Pays*****************//
			if (f.getPaysDto() != null) {
				Pays pays = new Pays();
				pays.setNom(f.getPaysDto().getNom());
				em.persist(pays);

			}

			transaction.commit();

		}

	}
}
