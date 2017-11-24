package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.IDaoCargaison;
import fr.adaming.modele.Cargaison;

@Service
@Transactional
public class ServiceCargaisonImpl implements IServiceCargaison {
	@Autowired
	private IDaoCargaison daoCargaison;
	
	public void setDaoCargaison(IDaoCargaison daoCargaison) {
		this.daoCargaison = daoCargaison;
	}
	

	@Override
	public Cargaison getCargaisonByReference(String reference) {
		return daoCargaison.getCargaisonByReference(reference);
	}

	@Override
	public List<Cargaison> getAllCargaisons() {
		return daoCargaison.getAllCargaisons();
	}

	@Override
	public Cargaison addCargaison(Cargaison cargaison) {
		return daoCargaison.addCargaison(cargaison);
	}

	@Override
	public Cargaison updateCargaison(Cargaison cargaison) {
		return daoCargaison.addCargaison(cargaison);
	}

	@Override
	public void deleteCargaison(String reference) {
		daoCargaison.deleteCargaison(reference);
	}
}
