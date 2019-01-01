package com.smz.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
@Entity
public class Employee extends Ouvrier {
	@Column(name = "salaire")
	private double salaire;

	@ManyToOne
	private Equipe equipe;
	
	@Override
	public double calculerCoutOuvrier() {
		return (this.salaire + 5000);
	}
	
	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
}
