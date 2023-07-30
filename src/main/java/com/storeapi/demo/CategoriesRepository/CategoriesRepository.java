package com.storeapi.demo.CategoriesRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.storeapi.demo.Categories.Categories;

public interface CategoriesRepository extends JpaRepository<Categories, Integer>{

}
