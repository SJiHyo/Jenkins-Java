package com.storeapi.demo.CustomerRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.storeapi.demo.Customer.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
