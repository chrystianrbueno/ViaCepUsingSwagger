package com.example.newViaCep.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.newViaCep.entity.AdressesEntity;

public interface AdressRepository extends CrudRepository<AdressesEntity, Long> {

	
}