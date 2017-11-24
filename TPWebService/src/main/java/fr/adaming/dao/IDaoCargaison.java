package fr.adaming.dao;

import java.util.List;

import fr.adaming.modele.Cargaison;

public interface IDaoCargaison {
	public Cargaison getCargaisonByReference(String reference);
	public List<Cargaison> getAllCargaisons();
	public Cargaison addCargaison(Cargaison cargaison);
	public Cargaison updateCargaison(Cargaison cargaison);
	public void deleteCargaison(String reference);
}
