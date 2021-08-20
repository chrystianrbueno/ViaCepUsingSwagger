package com.example.newViaCep.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/adresses/")
public class AdressesRestController {

	@GetMapping("zip/{zipCode}")
	public String getAdress (@PathVariable String zipCode) {
		return zipCode;
	}
	
}
