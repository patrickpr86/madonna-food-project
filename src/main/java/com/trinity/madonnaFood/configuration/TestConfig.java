package com.trinity.madonnaFood.configuration;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.trinity.madonnaFood.entities.Category;
import com.trinity.madonnaFood.entities.City;
import com.trinity.madonnaFood.entities.Product;
import com.trinity.madonnaFood.entities.State;
import com.trinity.madonnaFood.entities.User;
import com.trinity.madonnaFood.repository.AdressRepository;
import com.trinity.madonnaFood.repository.CategoryRepository;
import com.trinity.madonnaFood.repository.CityRepository;
import com.trinity.madonnaFood.repository.OrderItemRepository;
import com.trinity.madonnaFood.repository.OrderRepository;
import com.trinity.madonnaFood.repository.PaymentRepository;
import com.trinity.madonnaFood.repository.ProductRepository;
import com.trinity.madonnaFood.repository.StateRepository;
import com.trinity.madonnaFood.repository.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private StateRepository stateRepository;
	
	@Autowired
	private CityRepository cityRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private AdressRepository adressRepository;

	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private PaymentRepository paymentRepository;
	
	@Autowired
	private OrderItemRepository orderItemRepository;
	

	@Override
	public void run(String... args) throws Exception {
		
		Category c1 = new Category(null, "Bolos");
		Category c2 = new Category(null, "Paẽs");
		Category c3 = new Category(null, "Doces");
		
		Product p1 = new Product(null, "Bolo de Maçã", "Bolo de maçã com canela, mel e nozes", 18.00, "");
		Product p2 = new Product(null, "Bole de Fubá", "Bolo de fubá com recheio de goiabada", 18.00, "");
		Product p3 = new Product(null, "Pão Caseiro", "Pão caseiro leve", 10.00, "");
		
		
		
		p1.getCategories().addAll(Arrays.asList(c1));
		p2.getCategories().addAll(Arrays.asList(c1));
		p3.getCategories().addAll(Arrays.asList(c2));
		
		c1.getProducts().addAll(Arrays.asList(p1, p2));
		c2.getProducts().addAll(Arrays.asList(p3));
		
		categoryRepository.saveAll(Arrays.asList(c1, c2, c3));		
		productRepository.saveAll(Arrays.asList(p1, p2, p3));
		
		State uf1 = new State(null, "Espiríto Santo");
		State uf2 = new State(null, "São Paulo");
		
		City city1 = new City(null, "Vitória", uf1);
		City city2 = new City(null, "Paulínia", uf2);
		City city3 = new City(null, "Campinas", uf2);
		
		stateRepository.saveAll(Arrays.asList(uf1, uf2));
		cityRepository.saveAll(Arrays.asList(city1, city2, city3));
		
		User u1 = new User(null, "Maria Luiza", "malu@gmail.com", "19978458361", "123456");
		User u2 = new User(null, "Marciano Pascoal", "marciano@gmail.com", "27978962247", "123456");
		
		
		
		
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
		
	}

}
