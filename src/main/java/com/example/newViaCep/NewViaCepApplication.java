package com.example.newViaCep;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.newViaCep.entity.AddressEntity;
import com.example.newViaCep.repository.AddressRepository;

@SpringBootApplication
public class NewViaCepApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewViaCepApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(AddressRepository repository) {

		return (args) -> {
			// save a few customers
			repository.save(new AddressEntity("94935410", "Rua L�dio Batista Soares"));
			repository.save(new AddressEntity("90010170", "Pra�a Montevid�o"));
			repository.save(new AddressEntity("01001000", "Pra�a da S�"));
		};
	}
}