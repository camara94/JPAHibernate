package com.camaratek.manager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.camaratek.doaimpl.ProduitDaoImpl;
import com.camaratek.model.Produit;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("jpa_prod");
		
		/*Produit p = new Produit(1L, "Acer Aspire E 15", 3500.00, 40);
		
		ProduitDaoImpl produitDaoImpl = new ProduitDaoImpl();
		produitDaoImpl.save(p);*/
		
		
		
	}

}
