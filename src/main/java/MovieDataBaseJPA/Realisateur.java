package MovieDataBaseJPA;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Realisateur
 */
@Entity
@Table(name = "REALISATEUR")
public class Realisateur extends Personne{

	/** Id */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	/** nom */
	@Column(name = "nom")
	private String nom;

	/** prenom */
	@Column(name = "prenom")
	private String prenom;

	/** url */
	@Column(name = "url")
	private String url;

	/** constructor */
	public Realisateur() {
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
	 * Getter pour l'attribut prenom
	 *
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Setter pour l'attribut prenom
	 *
	 * @param the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * Getter pour l'attribut url
	 *
	 * @return the url
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

}
