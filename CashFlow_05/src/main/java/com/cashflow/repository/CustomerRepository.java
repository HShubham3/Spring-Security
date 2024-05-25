package com.cashflow.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cashflow.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    List<Customer> findByEmail(String username);

}
