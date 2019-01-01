package com.smz.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
@Entity

public class Robot extends Ouvrier {
	@Column(name = "numero_serie")
	private int numeroSerie;

	private Modele modele;
	
	@ManyToOne
	private Equipe equipe;
	
	@Override
	public double calculerCoutOuvrier() {
		int nbJourTravail = 0;
		double res = this.modele.getCoutExploitationMensuel() + 0.3546 + nbJourTravail;
		return res;
	}
	
	
	public int getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(int numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public Modele getModele() {
		return modele;
	}

	public void setModele(Modele modele) {
		this.modele = modele;
	}
	
	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
}
