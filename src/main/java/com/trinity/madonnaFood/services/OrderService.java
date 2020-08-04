package com.trinity.madonnaFood.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trinity.madonnaFood.entities.Order;
import com.trinity.madonnaFood.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;

	
	public List<Order> findAll(){
		return repository.findAll();
		
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
		
	}
	
	public Order insert(Order obj) {
		return repository.save(obj);
	}
	
	public Order update(Long id, Order obj) {
		
			Order entity = repository.getOne(id);
			updateData(entity, obj);
			return repository.save(entity);
		
	}
	
	public void updateData(Order entity, Order obj) {
		entity.setMoment(obj.getMoment());
		entity.setPayment(obj.getPayment());
		
	
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
		
	}

}	
