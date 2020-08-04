package com.trinity.madonnaFood.configuration;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.trinity.madonnaFood.entities.Product;
import com.trinity.madonnaFood.entities.User;
import com.trinity.madonnaFood.repository.ProductRepository;
import com.trinity.madonnaFood.repository.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ProductRepository productRepository;
	

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Luiza", "malu@gmail.com", "19978458361", "123456");
		User u2 = new User(null, "Marciano Pascoal", "marciano@gmail.com", "27978962247", "123456");
		
		Product p1 = new Product(null, "Bolo de Maçã", "Bolo de maçã com canela, mel e nozes", 18.00, "");
		Product p2 = new Product(null, "Bole de Fubá", "Bolo de fubá com recheio de goiabada", 18.00, "");
		Product p3 = new Product(null, "Pão Caseiro", "Pão caseiro leve", 10.00, "");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		productRepository.saveAll(Arrays.asList(p1, p2, p3));
		
	}

}
