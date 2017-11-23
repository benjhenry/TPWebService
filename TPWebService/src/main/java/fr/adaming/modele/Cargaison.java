package fr.adaming.modele;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@MappedSuperclass
public abstract class Cargaison implements Serializable {
	private static final long serialVersionUID = 1L;

	// ========================= Attributs =========================
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_c")
	protected long id;
	@Column(name="reference_c")
	protected String reference;
	@Column(name="distance_c")
	protected double distance;
	@Column(name="dateLivraison_c")
	protected Calendar dateLivraison;
	
	// ========================= Constructeurs =========================
	public Cargaison() {
		super();
	}
	public Cargaison(String reference, double distance, Calendar dateLivraison) {
		super();
		this.reference = reference;
		this.distance = distance;
		this.dateLivraison = dateLivraison;
	}
	public Cargaison(int id, String reference, double distance,
			Calendar dateLivraison) {
		super();
		this.id = id;
		this.reference = reference;
		this.distance = distance;
		this.dateLivraison = dateLivraison;
	}

	// ========================= Getters / Setters =========================
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
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
	public Calendar getDateLivraison() {
		return dateLivraison;
	}
	public void setDateLivraison(Calendar dateLivraison) {
		this.dateLivraison = dateLivraison;
	}

	// ========================= Methodes =========================
	@Override
	public String toString() {
		return "Cargaison [id=" + id + ", reference=" + reference
				+ ", distance=" + distance + ", dateLivraison=" + dateLivraison
				+ "]";
	}
}
