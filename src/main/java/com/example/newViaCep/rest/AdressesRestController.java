package com.example.newViaCep.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.newViaCep.entity.AdressesEntity;
import com.example.newViaCep.repository.AdressesRepository;
/**
 * 
 * @author Chrystian Rocha
 *
 */
@RestController
@RequestMapping("api/adresses/")
public class AdressesRestController {

	@Autowired
	AdressesRepository repository;

	@GetMapping("zip/{zipCode}")
	public AdressesEntity getAdress(@PathVariable String zipCode) {
		return repository.findByZipCode(zipCode);
	}

}