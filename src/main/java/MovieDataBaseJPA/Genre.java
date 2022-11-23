package MovieDataBaseJPA;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GENRE")
public class Genre {
	
	/** Id */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	
	
	/** libelle */
	@Column(name = "libelle")
	private String libelle;
	
	
	
	/** constructor */
	public Genre() {
		
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
	 * Getter pour l'attribut libelle
	 *
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}


	/**
	 * Setter pour l'attribut libelle
	 *
	 * @param the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}
