package MovieDataBaseDTO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ActeurDto {

	private String identite;

	private String url;

	@JsonProperty("height")
	private Double hauteur;

	

	private NaissanceDto naissance;

	/** Liste des rolesDto  acteurs a une listes de roles*/
	private List<RoleDto> roles = new ArrayList<RoleDto>();

	/** constructor */
	public ActeurDto() {
		// TODO Auto-generated constructor stub
	}

	/** getters et setters */
	public String getIdentite() {
		return identite;
	}

	public void setIdentite(String identite) {
		this.identite = identite;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Double getHauteur() {
		return hauteur;
	}

	public void setHauteur(Double hauteur) {
		this.hauteur = hauteur;
	}

	 

	public List<RoleDto> getRoles() {
		return roles;
	}

	public void setRoles(List<RoleDto> roles) {
		this.roles = roles;
	}

	public NaissanceDto getNaissance() {
		return naissance;
	}

	public void setNaissance(NaissanceDto naissance) {
		this.naissance = naissance;
	}

	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}

	 
 
}
