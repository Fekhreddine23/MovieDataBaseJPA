package MovieDataBaseDTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LieuDto {

	/** region, ville, paysDto */

	/**
	 * Ville du lieu
	 */
	private String ville;

	/**
	 * Etat région de la ville
	 */
	private String etatDept;

	/**
	 * Pays de la ville
	 */
	private String pays;

	/** constructor */
	public LieuDto() {

		super();
	}

	/** getters et setters */

	public String getEtatDept() {
		return etatDept;
	}

	public void setEtatDept(String etatDept) {
		this.etatDept = etatDept;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	/** toString() */
	@Override
	public String toString() {
		return "LieuDto [region etat departement=" + etatDept + ", ville=" + ville + ", pays=" + pays + "]";
	}

}
