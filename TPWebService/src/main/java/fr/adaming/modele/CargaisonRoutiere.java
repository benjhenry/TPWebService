package fr.adaming.modele;

import java.util.Calendar;

import javax.persistence.Column;

public class CargaisonRoutiere extends Cargaison {
	private static final long serialVersionUID = 1L;
	
	// ========================= Attributs =========================
	@Column(name="temperatureConservation_ca")
	private double temperatureConservation;

	// ========================= Constructeurs =========================
	public CargaisonRoutiere() {
		super();
	}
	public CargaisonRoutiere(String reference, double distance,
			Calendar dateLivraison, double temperatureConservation) {
		super(reference, distance, dateLivraison);
		this.temperatureConservation = temperatureConservation;
	}
	public CargaisonRoutiere(int id, String reference, double distance,
			Calendar dateLivraison, double temperatureConservation) {
		super(id, reference, distance, dateLivraison);
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
				+ temperatureConservation + ", id=" + id + ", reference="
				+ reference + ", distance=" + distance + ", dateLivraison="
				+ dateLivraison + "]";
	}
}
