package com.fedi.InduVizor_1.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Obeya {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long idTache;
	private String Tache;
	private String projet;
	private String responsable;
	private String status;
	private Date dateCreation;
	private float delaiEstime;
	private float delaiReel;
	private boolean livrableJalon;
	
	
	
	
	public Obeya() {
		super();

	}




	public Long getIdTache() {
		return idTache;
	}




	public void setIdTache(Long idTache) {
		this.idTache = idTache;
	}




	public String getTache() {
		return Tache;
	}




	public void setTache(String tache) {
		Tache = tache;
	}




	public String getProjet() {
		return projet;
	}




	public void setProjet(String projet) {
		projet = projet;
	}




	public String getResponsable() {
		return responsable;
	}




	public void setResponsable(String responsable) {
		responsable = responsable;
	}




	public String getStatus() {
		return status;
	}




	public void setStatus(String status) {
		status = status;
	}




	public Date getDateCreation() {
		return dateCreation;
	}




	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}




	public float getDelaiEstime() {
		return delaiEstime;
	}




	public void setDelaiEstime(float delaiEstime) {
		this.delaiEstime = delaiEstime;
	}




	public float getDelaiReel() {
		return delaiReel;
	}




	public void setDelaiReel(float delaiReel) {
		this.delaiReel = delaiReel;
	}




	public boolean isLivrableJalon() {
		return livrableJalon;
	}




	public void setLivrableJalon(boolean livrableJalon) {
		this.livrableJalon = livrableJalon;
	}




	@Override
	public String toString() {
		return "Obeya [idTache=" + idTache + ", Tache=" + Tache + ", Projet=" + projet + ", Responsable=" + responsable
				+ ", Status=" + status + ", dateCreation=" + dateCreation + ", delaiEstime=" + delaiEstime
				+ ", delaiReel=" + delaiReel + ", livrableJalon=" + livrableJalon + "]";
	}




	public Obeya( String tache, String projet, String responsable, String status, Date dateCreation,
			float delaiEstime, float delaiReel, boolean livrableJalon) {
		super();
		
		Tache = tache;
		projet = projet;
		responsable = responsable;
		status = status;
		this.dateCreation = dateCreation;
		this.delaiEstime = delaiEstime;
		this.delaiReel = delaiReel;
		this.livrableJalon = livrableJalon;
	}
	
	
	
	
	
}
