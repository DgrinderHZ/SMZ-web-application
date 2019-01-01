package com.smz.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="equipe")
public class Equipe {
	@Id @GeneratedValue(generator="system-increment")
	@GenericGenerator(name="system-increment", strategy="increment")
	@Column(name="id")
	private int idEquipe;
	@Column(name="nom_equipe")
	private String nom;
	
	@OneToMany(mappedBy = "equipe")
	private List<Robot> robots = new ArrayList<Robot>();
	@OneToMany(mappedBy = "equipe")
	private List<Employee> employees = new ArrayList<Employee>();
	
	@ManyToOne
	private Gisement gisement;
	
	public Equipe() {
		
	}
	public int getIdEquipe() {
		return idEquipe;
	}

	public void setIdEquipe(int idEquipe) {
		this.idEquipe = idEquipe;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public List<Robot> getRobots() {
		return robots;
	}
	public void setRobots(List<Robot> robots) {
		this.robots = robots;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public Gisement getGisement() {
		return gisement;
	}
	public void setGisement(Gisement gisement) {
		this.gisement = gisement;
	}
	public double calculerCoutEquipe() {
		double res = 0;
		for(Ouvrier o : this.robots) {
			res += o.calculerCoutOuvrier();
		}
		for(Ouvrier o : this.employees) {
			res += o.calculerCoutOuvrier();
		}
		return res;
	}
}
