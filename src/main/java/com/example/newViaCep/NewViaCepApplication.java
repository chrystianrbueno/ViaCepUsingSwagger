package com.example.newViaCep;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.newViaCep.entity.AdressesEntity;
import com.example.newViaCep.repository.AdressesRepository;

@SpringBootApplication
public class NewViaCepApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewViaCepApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(AdressesRepository repository) {

		return (args) -> {
			// save a few customers
			repository.save(new AdressesEntity("94935410", "Rua L�dio Batista Soares"));
			repository.save(new AdressesEntity("90010170", "Pra�a Montevid�o"));
			repository.save(new AdressesEntity("01001000", "Pra�a da S�"));
		};
	}
}