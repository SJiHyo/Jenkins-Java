package com.storeapi.demo.ProductsRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.storeapi.demo.Products.Products;

public interface ProductsRepository extends JpaRepository<Products, Integer>{

}
