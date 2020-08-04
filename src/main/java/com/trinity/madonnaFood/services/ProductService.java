package com.trinity.madonnaFood.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trinity.madonnaFood.entities.Product;
import com.trinity.madonnaFood.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;

	
	public List<Product> findAll(){
		return repository.findAll();
		
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
		
	}
	
	public Product insert(Product obj) {
		return repository.save(obj);
	}
	
	public Product update(Long id, Product obj) {
		
			Product entity = repository.getOne(id);
			updateData(entity, obj);
			return repository.save(entity);
		
	}
	
	public void updateData(Product entity, Product obj) {
		entity.setName(obj.getName());
		entity.setDescription(obj.getDescription());
		entity.setPrice(obj.getPrice());
		entity.setImgURL(obj.getImgURL());
	
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
		
	}

}	
