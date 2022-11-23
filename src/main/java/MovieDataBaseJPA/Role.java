package MovieDataBaseJPA;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ROLE")
public class Role {

	/** Id */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private int id;

	/** nomPersonnage */
	@Column(name = "nomPersonnage")
	private String nomPersonnage;

	/** constructor */
	public Role() {
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
	 * Getter pour l'attribut NomPersonnage
	 *
	 * @return the NomPersonnage
	 */
	public String getNomPersonnage() {
		return nomPersonnage;
	}

	/**
	 * Setter pour l'attribut nomPersonnage
	 *
	 * @param the nomPersonnage to set
	 */
	public void setNomPersonnage(String nomPersonnage) {
		this.nomPersonnage = nomPersonnage;
	}

}
