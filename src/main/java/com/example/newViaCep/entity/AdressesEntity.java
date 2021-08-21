package com.example.newViaCep.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AdressesEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String publicPlace;
	private String zipCode;

	public AdressesEntity() {
	}

	public AdressesEntity(String zipCode, String publicPlace) {
		super();
		this.publicPlace = publicPlace;
		this.zipCode = zipCode;
	}

	public String getPublicPlace() {
		return publicPlace;
	}

	public void setPublicPlace(String publicPlace) {
		this.publicPlace = publicPlace;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "AdressesEntity [zipCode=" + zipCode + ", publicPlace=" + publicPlace + "]";
	}

}
