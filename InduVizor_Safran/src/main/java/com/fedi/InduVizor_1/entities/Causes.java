package com.fedi.InduVizor_1.entities;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;





@Entity	
public class Causes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCause;
	private LocalDate date;
	private String indicateur;
	private String probleme;
	private String raison1;
	private String raison2;
	private String raison3;
	private String raison4;
	private String raison5;
	private String action;
	private String pilote;
	private Date delai;
	private String status;

	public Causes() {
		super();
		
		

	}

	public long getIdCause() {
		return idCause;
	}

	public void setIdCause(long idCause) {
		this.idCause = idCause;
	}

	public LocalDate  getDate() {
		return date;
	}

	public void setDate(LocalDate  date) {
		this.date = date;
	}

	public String getIndicateur() {
		return indicateur;
	}

	public void setIndicateur(String indicateur) {
		indicateur = indicateur;
	}

	public String getProbleme() {
		return probleme;
	}

	public void setProbleme(String probleme) {
		probleme = probleme;
	}

	public String getRaison1() {
		return raison1;
	}

	public void setRaison1(String raison1) {
		this.raison1 = raison1;
	}

	public String getRaison2() {
		return raison2;
	}

	public void setRaison2(String raison2) {
		this.raison2 = raison2;
	}

	public String getRaison3() {
		return raison3;
	}

	public void setRaison3(String raison3) {
		this.raison3 = raison3;
	}

	public String getRaison4() {
		return raison4;
	}

	public void setRaison4(String raison4) {
		this.raison4 = raison4;
	}

	public String getRaison5() {
		return raison5;
	}

	public void setRaison5(String raison5) {
		this.raison5 = raison5;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		action = action;
	}

	public String getPilote() {
		return pilote;
	}

	public void setPilote(String pilote) {
		pilote = pilote;
	}

	public Date getDelai() {
		return delai;
	}

	public void setDelai(Date delai) {
		delai = delai;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	@Override
	public String toString() {
		return "Causes [idCause=" + idCause + ", date=" + date + ", Indicateur=" + indicateur + ", Probleme=" + probleme
				+ ", raison1=" + raison1 + ", raison2=" + raison2 + ", raison3=" + raison3 + ", raison4=" + raison4
				+ ", raison5=" + raison5 + ", Action=" + action + ", Pilote=" + pilote + ", Delai=" + delai
				+ ", status=" + status + "]";
	}

	public Causes(LocalDate  date, String indicateur, String probleme, String raison1, String raison2, String raison3,
			String raison4, String raison5, String action, String pilote, Date delai, String status) {
		super();
		this.date = date;
		indicateur = indicateur;
		probleme = probleme;
		this.raison1 = raison1;
		this.raison2 = raison2;
		this.raison3 = raison3;
		this.raison4 = raison4;
		this.raison5 = raison5;
		action = action;
		pilote = pilote;
		delai = delai;
		this.status = status;
	}

}
