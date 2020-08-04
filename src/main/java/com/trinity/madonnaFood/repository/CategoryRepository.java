package com.trinity.madonnaFood.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trinity.madonnaFood.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
