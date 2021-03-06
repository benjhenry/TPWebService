package fr.adaming.modele;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cargaisons_aeriennes")
public class CargaisonAerienne extends Cargaison {
	private static final long serialVersionUID = 1L;

	// ========================= Attributs =========================
	@Column(name = "poidsMax_ca")
	private double poidsMax;

	// ========================= Constructeurs =========================
	public CargaisonAerienne() {
		super();
	}

	public CargaisonAerienne(String reference, double distance,
			Date dateLivraison, double poidsMax) {
		super(reference, distance, dateLivraison);
		this.poidsMax = poidsMax;
	}

	// ========================= Getters / Setters =========================
	public double getPoidsMax() {
		return poidsMax;
	}

	public void setPoidsMax(double poidsMax) {
		this.poidsMax = poidsMax;
	}

	// ========================= Methodes =========================
	@Override
	public String toString() {
		return "CargaisonAerienne [poidsMax=" + poidsMax + ", reference="
				+ reference + ", distance=" + distance + ", dateLivraison="
				+ dateLivraison + "]";
	}
}
