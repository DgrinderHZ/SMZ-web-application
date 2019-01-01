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

@Table(name="equipe")
public abstract class Gisement {
	@Id 
	@Column(name="id")
	private int id;
	
	@Column(name = "date_mise_en_service")
	private Date dateMiseEnService;
	
	@Column(name = "rendement_mensuel")
	private double rendementMensuel;

	
	public abstract double calculerRevenue();
	
	public abstract double calculerCoutMensuel();
	
	public double calculerRentabilite() {
		double revenue = this.calculerRevenue();
		double cout = this.calculerCoutMensuel();
		return revenue - cout;
	}	
	
	public Date getDateMiseEnService() {
		return dateMiseEnService;
	}
	public void setDateMiseEnService(Date dateMiseEnService) {
		this.dateMiseEnService = dateMiseEnService;
	}
	public double getRendementMensuel() {
		return rendementMensuel;
	}
	public void setRendementMensuel(double rendementMensuel) {
		this.rendementMensuel = rendementMensuel;
	}
	
	
}
