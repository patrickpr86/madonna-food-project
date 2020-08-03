package com.trinity.madonnaFood.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.trinity.madonnaFood.entities.User;
import com.trinity.madonnaFood.services.UserService;

public class UserResources {
	
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
