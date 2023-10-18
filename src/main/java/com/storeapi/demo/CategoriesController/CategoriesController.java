package com.storeapi.demo.CategoriesController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.storeapi.demo.Categories.Categories;
import com.storeapi.demo.CategoriesRepository.CategoriesRepository;

@RestController
@CrossOrigin(origins ="*")
public class CategoriesController {
	
	@Autowired
	private CategoriesRepository categoriesRepository;
	
	@GetMapping("/Categories")
	public String index() {
		return "Welcome to Categories Homepage";
	}
	
	@PostMapping("/saveCategories")
	public Categories saveCategories(@RequestBody Categories categories) {
		categoriesRepository.save(categories);
		return categories;
	}
	
	@GetMapping("/getAllCategories")
	public List<Categories> getAllCategories() {
		List<Categories> categoriesList = categoriesRepository.findAll();
		return categoriesList;
	}
}
