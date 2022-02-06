package com.Meuz.apiPatientCov19.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Structure")
public class Structure {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nom;
	private String region;
	private String adress;
	private String telephone;
	private boolean vaccin;
	private boolean test;
	
	
	public Structure() {
		super();
	}
	public Structure(String nom, String region, String adress,String telephone, boolean vaccin, boolean test) {
		super();
		this.nom = nom;
		this.region = region;
		this.adress = adress;
		this.telephone=telephone;
		this.vaccin = vaccin;
		this.test = test;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
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
		return test;
	}
	public void setTest(boolean test) {
		this.test = test;
	}

		
}
