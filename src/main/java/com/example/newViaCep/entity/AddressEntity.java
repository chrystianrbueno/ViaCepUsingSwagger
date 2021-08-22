package com.example.newViaCep.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.newViaCep.rest.JacksonCustomAddressEntityDeserializer;
import com.example.newViaCep.rest.JacksonCustomAddressEntitySerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * 
 * @author Fabricio
 *
 */

@Entity
@Table(name = "addresses")
@JsonSerialize(using = JacksonCustomAddressEntitySerializer.class)
@JsonDeserialize(using = JacksonCustomAddressEntityDeserializer.class)
public class AddressEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "public_place")
	private String publicPlace;
	@Column(name = "zip_code")
	private String zipCode;

	public AddressEntity() {
	}

	public AddressEntity(String zipCode, String publicPlace) {
		super();
		this.publicPlace = publicPlace;
		this.zipCode = zipCode;
	}

	public Long getId() {
		return id;
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
