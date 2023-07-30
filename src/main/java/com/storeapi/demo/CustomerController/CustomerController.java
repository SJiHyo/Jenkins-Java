package com.storeapi.demo.CustomerController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.storeapi.demo.Customer.Customer;
import com.storeapi.demo.CustomerRepository.CustomerRepository;

@RestController
public class CustomerController {
	@Autowired
	private CustomerRepository customerRepository;
	
	@GetMapping("/customer")
	public String index() {
		return "Welcome to Customer Home Page!";
	}
	
	@PostMapping("/saveCustomer")
	public Customer saveCustomer(@RequestBody Customer customer) {
		customerRepository.save(customer);
		return customer;
	}
	
	@GetMapping("/getAllCustomers")
	public List<Customer> getAllCustomers() {
		List<Customer> customerList =  customerRepository.findAll();
		return customerList;
	}
	
	@GetMapping("/getCustomerById/{customerId}")
	public Customer getCustomerById(@PathVariable int customerId) {
		Customer singleCustomer = customerRepository.findById(customerId).get();
		return singleCustomer;
	}
	
}
