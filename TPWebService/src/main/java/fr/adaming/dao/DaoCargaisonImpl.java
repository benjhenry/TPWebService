package fr.adaming.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import fr.adaming.modele.Cargaison;

@Repository
public class DaoCargaisonImpl implements IDaoCargaison {
	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	

	@Override
	public Cargaison getCargaisonByReference(String reference) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cargaison> getAllCargaisons() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cargaison addCargaison(Cargaison cargaison) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cargaison updateCargaison(Cargaison cargaison) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCargaison(String reference) {
		// TODO Auto-generated method stub
	}
}
