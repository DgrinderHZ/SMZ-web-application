package com.smz.entity;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Bouzon extends Gisement {
	@Column(name = "purete")
	private int coefficientPurete;

	@OneToMany(mappedBy="gisement")
	private List<Equipe> equipes = new ArrayList<Equipe>();
	
	public double calculerCoutMensuel() {
		double res  = 0;
		for(Equipe e: this.equipes) {
			res += e.calculerCoutEquipe();
		}
		return res;
	}

	@Override
	public double calculerRevenue() {
		double res = this.getRendementMensuel() * this.coefficientPurete;
		return res;
	}

	public int getCoefficientPurete() {
		return coefficientPurete;
	}

	public void setCoefficientPurete(int coefficientPurete) {
		this.coefficientPurete = coefficientPurete;
	}
	
	public List<Equipe> getEquipes() {
		return equipes;
	}
	public void setEquipes(List<Equipe> equipes) {
		this.equipes = equipes;
	}

}
