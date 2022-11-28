package MovieDataBaseDTO;

import java.util.Date;

public class NaissanceDto {
	private Date dateNaissance;

	private String lieuNaissance;

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public NaissanceDto() {

		super();
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getLieuNaissance() {
		return lieuNaissance;
	}

	public void setLieuNaissance(String lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
	}

}
