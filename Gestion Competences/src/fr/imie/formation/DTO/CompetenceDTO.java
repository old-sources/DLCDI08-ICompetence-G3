package fr.imie.formation.DTO;

import java.util.List;

public class CompetenceDTO {

	private Integer num;
	private String nom;
	private List<NiveauDTO> listNiveau;
	private CompetenceDTO competenceDomaine;
	private List<CompetenceDTO> listCompetence;
	private int niveauArbo;

	

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<NiveauDTO> getListNiveau() {
		return listNiveau;
	}

	public void setListNiveau(List<NiveauDTO> listNiveau) {
		this.listNiveau = listNiveau;
	}

	public CompetenceDTO getCompetenceDomaine() {
		return competenceDomaine;
	}

	public void setCompetenceDomaine(CompetenceDTO competenceDomaine) {
		this.competenceDomaine = competenceDomaine;
	}

	public List<CompetenceDTO> getListCompetence() {
		return listCompetence;
	}

	public void setListCompetence(List<CompetenceDTO> listCompetence) {
		this.listCompetence = listCompetence;
	}


	public int getNiveauArbo() {
		return niveauArbo;
	}

	public void setNiveauArbo(int niveauArbo) {
		this.niveauArbo = niveauArbo;
	}

}
