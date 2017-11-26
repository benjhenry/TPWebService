package fr.adaming.modele;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="marchandises")
public class Marchandise implements Serializable {
	private static final long serialVersionUID = 1L;

	// ========================= Attributs =========================
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_m")
	private long id;
	@Column(name="nom_m")
	private String nom;
	@Column(name="poids_m")
	private double poids;
	@Column(name="volume_m")
	private double volume;
//	@ManyToOne
//	@JoinColumn(name="reference_c", referencedColumnName="reference_c")
//	private Cargaison cargaison;
	
	// ========================= Constructeurs =========================
	public Marchandise() {
		super();
	}
	public Marchandise(String nom, double poids, double volume) {
		super();
		this.nom = nom;
		this.poids = poids;
		this.volume = volume;
	}
	public Marchandise(long id, String nom, double poids, double volume) {
		super();
		this.id = id;
		this.nom = nom;
		this.poids = poids;
		this.volume = volume;
	}
	
	// ========================= Getters / Setters =========================
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getPoids() {
		return poids;
	}
	public void setPoids(double poids) {
		this.poids = poids;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
//	public Cargaison getCargaison() {
//		return cargaison;
//	}
//	public void setCargaison(Cargaison cargaison) {
//		this.cargaison = cargaison;
//	}
	
	// ========================= Methodes =========================
	@Override
	public String toString() {
		return "Marchandise [id=" + id + ", nom=" + nom + ", poids=" + poids
				+ ", volume=" + volume + "]";
	}
}
