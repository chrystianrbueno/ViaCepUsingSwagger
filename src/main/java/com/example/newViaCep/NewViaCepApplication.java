package com.example.newViaCep;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.newViaCep.entity.AdressesEntity;
import com.example.newViaCep.repository.AdressRepository;

@SpringBootApplication
public class NewViaCepApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewViaCepApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(AdressRepository repository) {

		return (args) -> {
			// save a few customers
			repository.save(new AdressesEntity("94935-410", "Rua Lídio Batista Soares"));
			repository.save(new AdressesEntity("90010-170", "Praça Montevidéo"));
			repository.save(new AdressesEntity("01001-000", "Praça da Sé"));
		};
	}
}
