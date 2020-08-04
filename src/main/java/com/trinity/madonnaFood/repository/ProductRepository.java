package com.trinity.madonnaFood.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trinity.madonnaFood.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
