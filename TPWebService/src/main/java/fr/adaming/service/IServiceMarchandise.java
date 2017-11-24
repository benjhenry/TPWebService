package fr.adaming.service;

import java.util.List;

import fr.adaming.modele.Cargaison;
import fr.adaming.modele.Marchandise;

public interface IServiceMarchandise {
	public Marchandise getMarchandiseByReference(long id);
	public List<Marchandise> getAllMarchandises();
	public Marchandise addMarchandise(Marchandise marchandise, Cargaison cargaison);
	public Marchandise updateMarchandise(Marchandise marchandise, Cargaison cargaison);
	public void deleteMarchandise(long id);
}
