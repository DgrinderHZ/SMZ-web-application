package com.smz.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Modele {
	@Column(name = "date_conception")
	private Date dateConception;
	
	@Column(name = "cout_exploitation_mensuel")
	private double coutExploitationMensuel;
	
	public Modele(Date dateConception, double coutExploitationMensuel) {
		super();
		this.dateConception = dateConception;
		this.coutExploitationMensuel = coutExploitationMensuel;
	}

	public Date getDateConception() {
		return dateConception;
	}

	public void setDateConception(Date dateConception) {
		this.dateConception = dateConception;
	}

	public double getCoutExploitationMensuel() {
		return coutExploitationMensuel;
	}

	public void setCoutExploitationMensuel(double coutExploitationMensuel) {
		this.coutExploitationMensuel = coutExploitationMensuel;
	}
	
}
