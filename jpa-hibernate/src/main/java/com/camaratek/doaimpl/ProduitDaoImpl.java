package com.camaratek.doaimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.camaratek.dao.IProduitDao;
import com.camaratek.model.Produit;

public class ProduitDaoImpl implements IProduitDao {
	
	/* D�claration de l'objet EntityManager qui permet de g�rer les entit�s*/
	private EntityManager entityManager;
	
	/* Constructeur */
	public ProduitDaoImpl() {
		
		/*Creation de l'objet entity manager Factory */
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa_prod");
		
		/* Cr�ation de l'objet entity manager */
		entityManager = entityManagerFactory.createEntityManager();
	}

	public void save(Produit p) {
		/*
		 *  Cr�ation de transaction
		 */
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		/**
		 * D�marrer la Transaction
		 */
		entityTransaction.begin();
		try {
			

			/**
			 *  Enr�gistrer le produit dans la base de donn�e
			 */
			entityManager.persist(p);
			
			entityTransaction.commit();
		} catch (Exception e) {
			
			/*
			 *  Annuler la transaction en cas d'exception
			 */
			entityTransaction.rollback();
			e.printStackTrace();
		}
		
		
		
	}

	public List<Produit> findAll() {
		
		Query query = entityManager.createQuery("SELECT p FROM Produit p");
		
		return query.getResultList();
	}

	public List<Produit> findByDesignation(String designation) {
		Query query = entityManager.createQuery("SELECT p FROM Produit p WHERE p.designation LIKE :x");
		query.setParameter("x", "%" + designation + "%");
		return query.getResultList();
	}

	public Produit findById(Long id) {
		Produit produit = entityManager.find(Produit.class, id);
		return produit;
	}

	public void update(Produit p) {
		
		entityManager.merge(p);
	}

	public void delete(Long id) {
		Produit produit = entityManager.find(Produit.class, id);
		
		entityManager.remove(produit);
	}

}
