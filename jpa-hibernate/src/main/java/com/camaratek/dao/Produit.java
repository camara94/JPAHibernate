package com.camaratek.dao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name = "produit")
public class Produit implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column( name = "ref" )
	private Long reference;
	@Column( name = "designation" )
	private String designation;
	@Column( name = "prix" )
	private double prix;
	@Column( name = "quantite" )
	private int quantite;
	
	@Transient
	private String ignorer;
	
	public Produit() {}
	
	public Produit(Long reference, String designation, double prix, int quantite) {
		super();
		this.reference = reference;
		this.designation = designation;
		this.prix = prix;
		this.quantite = quantite;
	}

	public Long getReference() {
		return reference;
	}

	public void setReference(Long reference) {
		this.reference = reference;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public String getIgnorer() {
		return ignorer;
	}

	public void setIgnorer(String ignorer) {
		this.ignorer = ignorer;
	}
	
	
	
}
