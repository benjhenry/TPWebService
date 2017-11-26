package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import fr.adaming.dao.IDaoMarchandise;
import fr.adaming.modele.Cargaison;
import fr.adaming.modele.Marchandise;

@Service
@Transactional
public class ServiceMarchandiseImpl implements IServiceMarchandise {
	@Autowired
	private IDaoMarchandise daoMarchandise;
	
	public void setDaoMarchandise(IDaoMarchandise daoMarchandise) {
		this.daoMarchandise = daoMarchandise;
	}

	
	@Override
	public Marchandise getMarchandiseByReference(long id) {
		return daoMarchandise.getMarchandiseByReference(id);
	}

	@Override
	public List<Marchandise> getAllMarchandises() {
		return daoMarchandise.getAllMarchandises();
	}

	@Override
	public Marchandise addMarchandise(Marchandise marchandise, Cargaison cargaison) {
		marchandise.setCargaison(cargaison);
		return daoMarchandise.addMarchandise(marchandise);
	}

	@Override
	public Marchandise updateMarchandise(Marchandise marchandise, Cargaison cargaison) {
		marchandise.setCargaison(cargaison);
		return daoMarchandise.updateMarchandise(marchandise);
	}

	@Override
	public void deleteMarchandise(long id) {
		daoMarchandise.deleteMarchandise(id);
	}
}
