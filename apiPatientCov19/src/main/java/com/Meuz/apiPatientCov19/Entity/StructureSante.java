package com.Meuz.apiPatientCov19.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StructureSante")
public class StructureSante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String contact;
	private String region;
	private String adress;
	private boolean vaccin;
	private boolean teste;
	private int nombreTotalDePlace;
	private int nombreDePlaceOccupé;
	
	public StructureSante() {
		super();
	}

	public StructureSante(String nom, String contact, String region, String adress, boolean vaccin, boolean test,
			int nombreTotalDePlace, int nombreDePlaceOccupé) {
		super();
		this.nom = nom;
		this.contact = contact;
		this.region = region;
		this.adress = adress;
		this.vaccin = vaccin;
		this.teste = test;
		this.nombreTotalDePlace = nombreTotalDePlace;
		this.nombreDePlaceOccupé = nombreDePlaceOccupé;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public boolean isVaccin() {
		return vaccin;
	}

	public void setVaccin(boolean vaccin) {
		this.vaccin = vaccin;
	}

	public boolean isTest() {
		return teste;
	}

	public void setTest(boolean test) {
		this.teste = test;
	}

	public int getNombreTotalDePlace() {
		return nombreTotalDePlace;
	}

	public void setNombreTotalDePlace(int nombreTotalDePlace) {
		this.nombreTotalDePlace = nombreTotalDePlace;
	}

	public int getNombreDePlaceOccupé() {
		return nombreDePlaceOccupé;
	}

	public void setNombreDePlaceOccupé(int nombreDePlaceOccupé) {
		this.nombreDePlaceOccupé = nombreDePlaceOccupé;
	}
	
	

}
