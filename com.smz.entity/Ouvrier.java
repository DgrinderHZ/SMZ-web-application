package com.smz.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@Table(name="ouvrier")
public abstract class Ouvrier {
	@Id 
	@Column(name="id")
	private int id;
	
	@Column(name = "nom")
	private String nom;
	
	@Column(name = "date_affectation")
	private Date dateAffectation;
	
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Date getDateAffectation() {
		return dateAffectation;
	}

	public void setDateAffectation(Date dateAffectation) {
		this.dateAffectation = dateAffectation;
	}
	
	

	public abstract double calculerCoutOuvrier();
}
