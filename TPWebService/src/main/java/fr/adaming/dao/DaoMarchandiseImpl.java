package fr.adaming.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import fr.adaming.modele.Marchandise;

@Repository
public class DaoMarchandiseImpl implements IDaoMarchandise {
	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	@Override
	public Marchandise getMarchandiseByReference(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Marchandise> getAllMarchandises() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Marchandise addMarchandise(Marchandise marchandise) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Marchandise updateMarchandise(Marchandise marchandise) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMarchandise(long id) {
		// TODO Auto-generated method stub
	}
}
