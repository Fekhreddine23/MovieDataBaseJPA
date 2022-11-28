package MovieDataBaseDTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GenreDto {
	
	private String nom;
	
	/** constructor */
	public GenreDto(String nom) {
		this.nom = nom;
	}
    
	
	/** getter et setters*/
	public String getNom() {
		return nom;
	}
    
	
	/** getter et setters*/
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** override*/
	@Override
	public String toString() {
		return "GenreDto [nom=" + nom + "]";
	}
	
	

}
