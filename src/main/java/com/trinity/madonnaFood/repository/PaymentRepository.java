package com.trinity.madonnaFood.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trinity.madonnaFood.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long>{

}
