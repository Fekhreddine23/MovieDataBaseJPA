package MovieDataBaseJPA;

import java.util.ArrayList;
import java.util.Date;
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

import MovieDataBaseDTO.LieuDto;

/**
 * @author Fekhreddine Class Acteur
 */
@Entity
@Table(name = "ACTEUR")
public class Acteur extends Personne {

	/** Id */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private int id;

	/** date naissance */
	@Column(name = "DateNaissance")
	private Date DateNaissance;

	/** lieuNaissance */
	@Column(name = "lieuNaissance")
	private String lieuNaissance;

	/** paysNaissance */
	@Column(name = "paysNaissance")
	private String paysNaissance;

	/** taille */
	@Column(name = "taille")
	private double taille;

	/** constructor */
	public Acteur() {

		super();

	}

	/** Liste des roles */
	@ManyToMany
	@JoinTable(name = "roles_par_acteurs", joinColumns = @JoinColumn(name = "ACTEUR_ID", referencedColumnName = "ID"),
	inverseJoinColumns = @JoinColumn(name = "ROLE_ID", referencedColumnName = "ID"))

	private List<Role> roles = new ArrayList<Role>();

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
	 * Getter pour l'attribut DateNaissance
	 *
	 * @return the DateNaissance
	 */
	public Date getDateNaissance() {
		return DateNaissance;
	}

	/**
	 * Setter pour l'attribut dateNaissance
	 *
	 * @param the dateNaissance to set
	 */
	public void setDateNaissance(Date dateNaissance) {
		DateNaissance = dateNaissance;
	}

	/**
	 * Getter pour l'attribut LieuNaissance
	 *
	 * @return the LieuNaissance
	 */
	public String getLieuNaissance() {
		return lieuNaissance;
	}

	/**
	 * Setter pour l'attribut lieuNaissance
	 *
	 * @param the lieuNaissance to set
	 */
	public void setLieuNaissance(String lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
	}

	/**
	 * Getter pour l'attribut PaysNaissance
	 *
	 * @return the PaysNaissance
	 */
	public String getPaysNaissance() {
		return paysNaissance;
	}

	/**
	 * Setter pour l'attribut PaysNaissance
	 *
	 * @param the PaysNaissance to set
	 */
	public void setPaysNaissance(String paysNaissance) {
		this.paysNaissance = paysNaissance;
	}

	/**
	 * Getter pour l'attribut Taille
	 *
	 * @return the taille
	 */
	public double getTaille() {
		return taille;
	}

	/**
	 * Setter pour l'attribut Taille
	 *
	 * @param the Taille to set
	 */
	public void setTaille(double d) {
		this.taille = d;
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
