package com.example.newViaCep.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.newViaCep.entity.AdressesEntity;
/**
 * 
 * @author Chrystian Rocha
 *
 */
public interface AdressesRepository extends CrudRepository<AdressesEntity, Long> {

	public AdressesEntity findByZipCode(String zipCode);
}