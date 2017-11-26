package fr.adaming.service;

import java.util.List;

import fr.adaming.modele.Cargaison;

public interface IServiceCargaison {
	public Cargaison getCargaisonByReference(String type, String reference);
	public List<Cargaison> getAllCargaisons(String type);
	public Cargaison addCargaison(Cargaison cargaison);
	public Cargaison updateCargaison(Cargaison cargaison);
	public void deleteCargaison(String type, String reference);
}
