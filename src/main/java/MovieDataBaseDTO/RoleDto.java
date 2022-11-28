package MovieDataBaseDTO;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RoleDto {

	@JsonProperty("characterName")
	private String nom;

	private ActeurDto acteur;

	@JsonProperty("film")
	private String reference;

	/** constructor */
	public RoleDto() {
		// TODO Auto-generated constructor stub
	}

	/** getter et setter */
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ActeurDto getActeur() {
		return acteur;
	}

	public void setActeur(ActeurDto acteur) {
		this.acteur = acteur;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String Reference) {
		this.reference = Reference;
	}

	// methode ToString()
	@Override
	public String toString() {
		return "RoleDto [nom=" + nom + ", acteur=" + acteur + ", Reference=" + reference + "]";
	}

}
