package com.storeapi.demo.CartController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.storeapi.demo.Cart.Cart;
import com.storeapi.demo.CartRepository.CartRepository;

@RestController
public class CartController {
	
	@Autowired
	private CartRepository cartRepository;
	
	@GetMapping("/cartHome")
	public String index() {
		return "Welcome to Cart Home Page!";
	}
	
	@PostMapping("/saveCart")
	public Cart saveToCart(@RequestBody Cart cart) {
		cartRepository.save(cart);
		return cart;
	}
}
