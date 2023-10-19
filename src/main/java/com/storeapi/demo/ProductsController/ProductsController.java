package com.storeapi.demo.ProductsController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.storeapi.demo.Products.Products;
import com.storeapi.demo.ProductsRepository.ProductsRepository;

@RestController
public class ProductsController {
	
	@Autowired
	private ProductsRepository productsRepository;
	
	@GetMapping("/productsHome")
	public String index() {
		return "Welcome to Products Home Page!";
	}
	
	@PostMapping("/saveProducts")
	public Products saveProducts(@RequestBody Products products) {
		productsRepository.save(products);
		return products;
	}
	
	@GetMapping("/getAllProducts")
	public List<Products> getAllProducts() {
		List<Products> productsList = productsRepository.findAll();
		return productsList;
	}
	
	@GetMapping("/getProductById/{productId}")
	public Products getProduct(@PathVariable int productId) {
		Products singleProduct = productsRepository.findById(productId).get();
		return singleProduct;
	}
	
	@PutMapping("/updateProduct/{productId}")
	public ResponseEntity<Products> updateProductById(@PathVariable int productId,@RequestBody Products products) {
		Optional<Products> product = productsRepository.findById(productId);
		if(product.isPresent()) {
			product.get().setTitle(products.getTitle());
			product.get().setPrice(products.getPrice());
			product.get().setDescription(products.getDescription());
			product.get().setCategory(products.getCategory());
			product.get().setImage(products.getImage());
			product.get().setRating(products.getRating());
			product.get().setCount(products.getCount());
			return new ResponseEntity<>(productsRepository.save(products),HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
