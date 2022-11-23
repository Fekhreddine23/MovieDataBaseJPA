package MovieDataBaseJPA;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Film
 */
@Entity
@Table(name = "FILM")
public class Film {

	/** Id */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	/** nom */
	@Column(name = "nom")
	private String nom;

	/** url */
	@Column(name = "url")
	private String url;

	/** plot */
	@Column(name = "plot")
	private String plot;

	/** langue */
	@Column(name = "langue")
	private String langue;

	/** Liste des realisateurs */
	@ManyToMany
	@JoinTable(name = "film_de_Realisateur", joinColumns = @JoinColumn(name = "FILM_ID", referencedColumnName = "ID"), 
	inverseJoinColumns = @JoinColumn(name = "REALISATEUR_ID", referencedColumnName = "ID"))

	private List<Realisateur> realisateurs = new ArrayList<Realisateur>();

	/** Liste des tournages */
	@ManyToMany
	@JoinTable(name = "lieu_tournage_film", joinColumns = @JoinColumn(name = "FILM_ID", referencedColumnName = "ID"),
	inverseJoinColumns = @JoinColumn(name = "TOURNAGE_ID", referencedColumnName = "ID"))

	private List<Tournage> tournages = new ArrayList<Tournage>();

	/** Liste des genres */
	@ManyToMany
	@JoinTable(name = "genres_films", joinColumns = @JoinColumn(name = "FILM_ID", referencedColumnName = "ID"),
	inverseJoinColumns = @JoinColumn(name = "GENRE_ID", referencedColumnName = "ID"))

	private List<Genre> genres = new ArrayList<Genre>();

	/** Liste des acteurs */
	@ManyToMany
	@JoinTable(name = "films_participe_acteur", joinColumns = @JoinColumn(name = "FILM_ID", referencedColumnName = "ID"), 
	inverseJoinColumns = @JoinColumn(name = "ACTEUR_ID", referencedColumnName = "ID"))

	private List<Acteur> acteurs = new ArrayList<Acteur>();

	/** Liste des roles */
	@ManyToMany
	@JoinTable(name = "roles_present_films", joinColumns = @JoinColumn(name = "FILM_ID", referencedColumnName = "ID"),
	inverseJoinColumns = @JoinColumn(name = "ROLE_ID", referencedColumnName = "ID"))

	private List<Role> roles = new ArrayList<Role>();

	/** constructor */
	public Film() {

		super();

	}

	/**
	 * Getter pour l'attribut id
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Setter pour l'attribut id
	 *
	 * @param the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Getter pour l'attribut nom
	 *
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter pour l'attribut nom
	 *
	 * @param the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter pour l'attribut Url
	 *
	 * @return the Url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Setter pour l'attribut url
	 *
	 * @param the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * Getter pour l'attribut Plot
	 *
	 * @return the Plot
	 */
	public String getPlot() {
		return plot;
	}

	/**
	 * Setter pour l'attribut plot
	 *
	 * @param the plot to set
	 */
	public void setPlot(String plot) {
		this.plot = plot;
	}

	/**
	 * Getter pour l'attribut Langue
	 *
	 * @return the Langue
	 */
	public String getLangue() {
		return langue;
	}

	/**
	 * Setter pour l'attribut langue
	 *
	 * @param the langue to set
	 */
	public void setLangue(String langue) {
		this.langue = langue;
	}

	/**
	 * Getter pour l'attribut realisateurs
	 *
	 * @return the realisateurs
	 */
	public List<Realisateur> getRealisateurs() {
		return realisateurs;
	}

	/**
	 * Getter pour l'attribut tournages
	 *
	 * @return the tournages
	 */

	public List<Tournage> getTournages() {
		return tournages;
	}

	/**
	 * Getter pour l'attribut genres
	 *
	 * @return the genres
	 */
	public List<Genre> getGenres() {
		return genres;
	}

	/**
	 * Getter pour l'attribut acteurs
	 *
	 * @return the acteurs
	 */
	public List<Acteur> getActeurs() {
		return acteurs;
	}

	/**
	 * Getter pour l'attribut roles
	 *
	 * @return the roles
	 */
	public List<Role> getRoles() {
		return roles;
	}

}
