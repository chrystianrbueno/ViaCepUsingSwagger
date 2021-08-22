package com.example.newViaCep.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.newViaCep.entity.AddressEntity;
import com.example.newViaCep.repository.AddressRepository;
/**
 * 
 * @author Chrystian Rocha
 *
 */
@RestController
@RequestMapping("api/addresses/")
public class AddressRestController {

	@Autowired
	AddressRepository repository;

	@GetMapping("zip/{zipCode}")
	public AddressEntity getAddress(@PathVariable String zipCode) {
		return repository.findByZipCode(zipCode);
	}
	
}