package fr.adaming.modele;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="cargaisons")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Cargaison implements Serializable {
	private static final long serialVersionUID = 1L;

	// ========================= Attributs =========================
	@Id
	@Column(name = "reference_c")
	protected String reference;
	@Column(name = "distance_c")
	protected double distance;
	@Column(name = "dateLivraison_c")
	@Temporal(TemporalType.DATE)
	protected Date dateLivraison;
//	@OneToMany(mappedBy = "cargaison")
//	private List<Marchandise> marchandises;

	// ========================= Constructeurs =========================
	public Cargaison() {
		super();
	}
	public Cargaison(String reference, double distance, Date dateLivraison) {
		super();
		this.reference = reference;
		this.distance = distance;
		this.dateLivraison = dateLivraison;
	}

	// ========================= Getters / Setters =========================
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public Date getDateLivraison() {
		return dateLivraison;
	}
	public void setDateLivraison(Date dateLivraison) {
		this.dateLivraison = dateLivraison;
	}
//	public List<Marchandise> getMarchandises() {
//		return marchandises;
//	}
//	public void setMarchandises(List<Marchandise> marchandises) {
//		this.marchandises = marchandises;
//	}

	// ========================= Methodes =========================
	@Override
	public String toString() {
		return "Cargaison [reference=" + reference + ", distance=" + distance
				+ ", dateLivraison=" + dateLivraison + "]";
	}
}
