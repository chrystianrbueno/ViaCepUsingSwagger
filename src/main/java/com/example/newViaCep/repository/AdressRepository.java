package com.example.newViaCep.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.newViaCep.entity.AdressesEntity;

public interface AdressRepository extends CrudRepository<AdressesEntity, Long> {

	public List <AdressesEntity> getAllAdresses();
	public AdressesEntity findByZipCode(String zipCode);
	
}