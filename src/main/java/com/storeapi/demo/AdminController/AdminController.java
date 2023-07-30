package com.storeapi.demo.AdminController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.storeapi.demo.Admin.Admin;
import com.storeapi.demo.AdminRepository.AdminRepository;

@RestController
public class AdminController {
	
	@Autowired
	private AdminRepository adminRepository;
	
	@GetMapping("/admin")
	public String index() {
		return "Welcome to Admin Page!";
	}
	
	@PostMapping("/saveAdmin")
	public Admin saveAdmin(@RequestBody Admin admin) {
		adminRepository.save(admin);
		return admin;
	}
}
