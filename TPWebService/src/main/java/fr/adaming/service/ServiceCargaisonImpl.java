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
	public Cargaison getCargaisonByReference(String type, String reference) {
		return daoCargaison.getCargaisonByReference(type, reference);
	}

	@Override
	public List<Cargaison> getAllCargaisons(String type) {
		return daoCargaison.getAllCargaisons(type);
	}

	@Override
	public Cargaison addCargaison(Cargaison cargaison) {
		return daoCargaison.addCargaison(cargaison);
	}

	@Override
	public Cargaison updateCargaison(Cargaison cargaison) {
		return daoCargaison.updateCargaison(cargaison);
	}

	@Override
	public void deleteCargaison(String type, String reference) {
		daoCargaison.deleteCargaison(type, reference);
	}
}
