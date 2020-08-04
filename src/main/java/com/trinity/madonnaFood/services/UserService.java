package com.trinity.madonnaFood.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trinity.madonnaFood.entities.User;
import com.trinity.madonnaFood.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;

	
	public List<User> findAll(){
		return repository.findAll();
		
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
		
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public User update(Long id, User obj) {
		
			User entity = repository.getOne(id);
			updateData(entity, obj);
			return repository.save(entity);
		
	}
	
	public void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
		entity.setPassword(obj.getPassword());
	
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
		
	}

}	
