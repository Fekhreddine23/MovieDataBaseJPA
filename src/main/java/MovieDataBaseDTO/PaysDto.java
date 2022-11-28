package MovieDataBaseDTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

 

@JsonIgnoreProperties(ignoreUnknown = true)
public class PaysDto {
	

	/** nom */
	private String nom;

	/** url */
	private String url;

	/** constructor */
	public PaysDto() {

		super();

	}

	/** getters et setters */
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	/** override */
	@Override
	public String toString() {
		return "PaysDto [ nom=" + nom + ", url=" + url + "]";
	}

}
