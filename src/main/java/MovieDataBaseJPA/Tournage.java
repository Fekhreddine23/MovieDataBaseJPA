package MovieDataBaseJPA;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TOURNAGE")
public class Tournage {

	/** Id */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	/** ville */
	@Column(name = "ville")
	private String ville;

	/** etat */
	@Column(name = "etat")
	private String etat;
	

	/** Pays */
	@ManyToOne
	@JoinColumn(name="PAYS_ID")
	private Pays pays;
	

	/** constructor */
	public Tournage() {
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
	 * Getter pour l'attribut Ville
	 *
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * Setter pour l'attribut ville
	 *
	 * @param the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

	/**
	 * Getter pour l'attribut etat
	 *
	 * @return the etat
	 */
	public String getEtat() {
		return etat;
	}

	/**
	 * Setter pour l'attribut etat
	 *
	 * @param the etat to set
	 */
	public void setEtat(String etat) {
		this.etat = etat;
	}
	
	/**
	 * Getter pour l'attribut pays
	 *
	 * @return the pays
	 */
	public Pays getPays() {
		return pays;
	}
	
	
	
	/**
	 * Setter pour l'attribut pays
	 *
	 * @param the pays to set
	 */
	public void setPays(Pays pays) {
		this.pays = pays;
	}

}
