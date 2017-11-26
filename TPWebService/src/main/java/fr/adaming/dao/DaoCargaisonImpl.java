package fr.adaming.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
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
	public Cargaison getCargaisonByReference(String type, String reference) {
		Session session = sessionFactory.getCurrentSession();
		String request;
		if (type.equals("a")) {
			request = "FROM CargaisonAerienne c WHERE c.reference=:pReference";
		} else if (type.equals("r")) {
			request = "FROM CargaisonRoutiere c WHERE c.reference=:pReference";
		} else  {
			return null;
		}
		Query query = session.createQuery(request);
		query.setParameter("pReference", reference);
		return (Cargaison) query.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cargaison> getAllCargaisons(String type) {
		Session session = sessionFactory.getCurrentSession();
		String request;
		if (type.equals("a")) {
			request = "FROM CargaisonAerienne c";
		} else if (type.equals("r")) {
			request = "FROM CargaisonRoutiere c";
		} else  {
			return new ArrayList<Cargaison>();
		}
		Query query = session.createQuery(request);
		return query.list();
	}

	@Override
	public Cargaison addCargaison(Cargaison cargaison) {
		Session session = sessionFactory.getCurrentSession();
		session.save(cargaison);
		return cargaison;
	}

	@Override
	public Cargaison updateCargaison(Cargaison cargaison) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(cargaison);
		return cargaison;
	}

	@Override
	public void deleteCargaison(String type, String reference) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(this.getCargaisonByReference(type, reference));
	}
}
