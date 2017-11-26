package fr.adaming.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
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
		Session session = sessionFactory.getCurrentSession();
		String request = "FROM Marchandise m WHERE m.id=:pId";
		Query query = session.createQuery(request);
		query.setParameter("pId", id);
		return (Marchandise) query.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Marchandise> getAllMarchandises() {
		Session session = sessionFactory.getCurrentSession();
		String request = "FROM Marchandise m";
		Query query = session.createQuery(request);
		return (List<Marchandise>) query.list();
	}

	@Override
	public Marchandise addMarchandise(Marchandise marchandise) {
		Session session = sessionFactory.getCurrentSession();
		session.save(marchandise);
		return marchandise;
	}

	@Override
	public Marchandise updateMarchandise(Marchandise marchandise) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(marchandise);
		return marchandise;
	}

	@Override
	public void deleteMarchandise(long id) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(this.getMarchandiseByReference(id));
	}
}
