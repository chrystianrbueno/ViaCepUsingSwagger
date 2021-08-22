package com.example.newViaCep.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.newViaCep.entity.AddressEntity;
/**
 * 
 * @author Chrystian Rocha
 *
 */
public interface AddressRepository extends CrudRepository<AddressEntity, Long> {

	public AddressEntity findByZipCode(String zipCode);
}