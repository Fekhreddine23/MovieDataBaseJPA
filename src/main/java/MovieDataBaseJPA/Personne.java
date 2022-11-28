package MovieDataBaseJPA;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Personne {
	
	/** Id */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	
	
	/**
	 * identite
	 */
	@Column(name = "identite", length = 100, nullable = false)
	private String identite;
	
	
	/**
	 * url
	 */
	@Column(name = "url", length = 1000, nullable = true)
	private String url;
	
	


	/** constructor */
	public Personne() {
		// TODO Auto-generated constructor stub
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
	 * @return the identite
	 */
	public String getIdentite() {
		return identite;
	}



	/**
	 * @param url the identite to set
	 */

	public void setIdentite(String identite) {
		this.identite = identite;
	}


	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */

	public void setUrl(String url) {
		this.url = url;
	}


	/**
	 * Renvoie la methode toString
	 */
	@Override
	public String toString() {
		return "Personne [id=" + id + ", identite=" + identite + ", url=" + url + "]";
	}
	
	
	
	


}
