package com.trinity.madonnaFood.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trinity.madonnaFood.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
