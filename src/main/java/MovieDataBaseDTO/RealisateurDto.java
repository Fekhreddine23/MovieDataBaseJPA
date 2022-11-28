package MovieDataBaseDTO;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RealisateurDto {

	/** id, identite, url */
	private int id;

	private String identite;

	private String url;

	/** listes filmDto */
	private List<FilmDto> films = new ArrayList<FilmDto>();

	/** constructor */
	public RealisateurDto() {
		super();
	}

	/** getters et setters */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public List<FilmDto> getFilms() {
		return films;
	}

	public void setFilms(List<FilmDto> films) {
		this.films = films;
	}

	@Override
	public String toString() {
		return "RealisateurDto [id=" + id + ", identite=" + identite + ", url=" + url + ", films=" + films + "]";
	}

}
