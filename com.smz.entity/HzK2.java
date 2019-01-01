package com.smz.entity;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class HzK2 extends Gisement {
	@Column(name = "densite")
	private int densite;
	
	@OneToMany(mappedBy="gisement")
	private List<Equipe> equipes = new ArrayList<Equipe>();
	
	@Override
	public double calculerRevenue() {
		double res = this.getRendementMensuel() * this.densite * 18.987;
		return res;
	}
	
	public double calculerCoutMensuel() {
		double res  = 0;
		for(Equipe e: this.equipes) {
			res += e.calculerCoutEquipe();
		}
		return res;
	}
	
	public int getDensite() {
		return densite;
	}

	public void setDensite(int densite) {
		this.densite = densite;
	}
	
	public List<Equipe> getEquipes() {
		return equipes;
	}
	public void setEquipes(List<Equipe> equipes) {
		this.equipes = equipes;
	}
}
