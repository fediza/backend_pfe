package com.fedi.InduVizor_1.entities;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class IP {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long idIP;
	private String Situation;
	private String Solution;
	private String Programme;
	private String CodeIP;
	private Date dateRealisation;
	private String Emeteur;
	private boolean HSE;
	
	
	
	
	public IP() {
		super();

	}




	public Long getIdIP() {
		return idIP;
	}




	public void setIdIP(Long idIP) {
		this.idIP = idIP;
	}




	public String getSituation() {
		return Situation;
	}




	public void setSituation(String situation) {
		Situation = situation;
	}




	public String getSolution() {
		return Solution;
	}




	public void setSolution(String solution) {
		Solution = solution;
	}




	public String getProgramme() {
		return Programme;
	}




	public void setProgramme(String programme) {
		Programme = programme;
	}




	public String getCodeIP() {
		return CodeIP;
	}




	public void setCodeIP(String codeIP) {
		CodeIP = codeIP;
	}




	public Date getDateRealisation() {
		return dateRealisation;
	}




	public void setDateRealisation(Date dateRealisation) {
		this.dateRealisation = dateRealisation;
	}




	public String getEmeteur() {
		return Emeteur;
	}




	public void setEmeteur(String emeteur) {
		Emeteur = emeteur;
	}




	public boolean isHSE() {
		return HSE;
	}




	public void setHSE(boolean hSE) {
		HSE = hSE;
	}




	@Override
	public String toString() {
		return "IP [idIP=" + idIP + ", Situation=" + Situation + ", Solution=" + Solution + ", Programme=" + Programme
				+ ", CodeIP=" + CodeIP + ", dateRealisation=" + dateRealisation + ", Emeteur=" + Emeteur + ", HSE="
				+ HSE + "]";
	}




	public IP(String situation, String solution, String programme, String codeIP, Date dateRealisation, String emeteur,
			boolean hSE) {
		super();
		Situation = situation;
		Solution = solution;
		Programme = programme;
		CodeIP = codeIP;
		this.dateRealisation = dateRealisation;
		Emeteur = emeteur;
		HSE = hSE;
	}
	
	
	
	
}






