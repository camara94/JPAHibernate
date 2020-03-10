package com.camaratek.dao;

import java.util.List;

import com.camaratek.model.Produit;

public interface IProduitDao {
	
	public void save( Produit p );
	public List<Produit> findAll();
	public List<Produit> findByDesignation( String designation );
	public Produit findById( Long id );
	public void update( Produit p );
	public void delete( Long id );
}
