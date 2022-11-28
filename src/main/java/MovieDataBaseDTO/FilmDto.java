package MovieDataBaseDTO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FilmDto {

	/** nom, url, plot, langue, dateSortie, paysDto lieuTournageDTO */
	@JsonProperty("id")
	private String id;

	private String nom;

	private String url;

	private String plot;

	private String langue;

	private Date dateSortie;
	
	
	@JsonProperty("pays")
	private PaysDto paysDto;
    
	
	@JsonProperty("lieuTournage")
	private LieuDto lieuTournageDto;

	@JsonProperty("roles") // list
	private List<RoleDto> roles = new ArrayList<RoleDto>();

	@JsonProperty("realisateurs")
	private List<RealisateurDto> realisateurs = new ArrayList<RealisateurDto>();

	@JsonProperty("genres")
	private List<GenreDto> genre = new ArrayList<GenreDto>();

	@JsonProperty("castingPrincipal")
	private List<ActeurDto> acteur = new ArrayList<ActeurDto>();

	
	 

	

	/** constructor */
	public FilmDto() {

		super();

	}

	
	/** methode getter et setters */
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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

	public String getPlot() {
		return plot;
	}

	public void setPlot(String plot) {
		this.plot = plot;
	}

	public String getLangue() {
		return langue;
	}

	public void setLangue(String langue) {
		this.langue = langue;
	}

	public Date getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}

	public PaysDto getPaysDto() {
		return paysDto;
	}

	public void setPaysDto(PaysDto paysDto) {
		this.paysDto = paysDto;
	}
	
	public LieuDto getLieuTournageDto() {
		return lieuTournageDto;
	}

	public void setLieuTournageDTO(LieuDto lieuTournageDto) {
		this.lieuTournageDto = lieuTournageDto;
	}

	public List<RoleDto> getRoles() {
		return roles;
	}

	public void setRoles(List<RoleDto> roles) {
		this.roles = roles;
	}

	public List<RealisateurDto> getRealisateurs() {
		return realisateurs;
	}

	public void setRealisateurs(List<RealisateurDto> realisateurs) {
		this.realisateurs = realisateurs;
	}

	public List<GenreDto> getGenre() {
		return genre;
	}

	public void setGenre(List<GenreDto> genre) {
		this.genre = genre;
	}

	public List<ActeurDto> getActeur() {
		return acteur;
	}

	public void setActeur(List<ActeurDto> acteur) {
		this.acteur = acteur;
	}

	

	  
	/** override methode toString */

	@Override
	public String toString() {
		return "FilmDto [id=" + id + ", nom=" + nom + ", url=" + url + ", plot=" + plot + ", langue=" + langue
				+ ", dateSortie=" + dateSortie + ", paysDto=" + paysDto + ", lieuTournageDTO=" + lieuTournageDto
				+ ", roles=" + roles + ", realisateur=" + realisateurs + ", genre=" + genre + ", acteur=" + acteur
				+ "]";
	}


	 

	 

	 

}
