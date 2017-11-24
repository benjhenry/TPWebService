package fr.adaming.modele;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cargaisons_routieres")
public class CargaisonRoutiere extends Cargaison {
	private static final long serialVersionUID = 1L;

	// ========================= Attributs =========================
	@Column(name = "temperatureConservation_cr")
	private double temperatureConservation;

	// ========================= Constructeurs =========================
	public CargaisonRoutiere() {
		super();
	}

	public CargaisonRoutiere(String reference, double distance,
			Date dateLivraison, double temperatureConservation) {
		super(reference, distance, dateLivraison);
		this.temperatureConservation = temperatureConservation;
	}

	// ========================= Getters / Setters =========================
	public double getTemperatureConservation() {
		return temperatureConservation;
	}

	public void setTemperatureConservation(double temperatureConservation) {
		this.temperatureConservation = temperatureConservation;
	}

	// ========================= Methodes =========================
	@Override
	public String toString() {
		return "CargaisonRoutiere [temperatureConservation="
				+ temperatureConservation + ", reference=" + reference
				+ ", distance=" + distance + ", dateLivraison=" + dateLivraison
				+ "]";
	}
}
