package com.storeapi.demo.CartRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.storeapi.demo.Cart.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer>{

}
