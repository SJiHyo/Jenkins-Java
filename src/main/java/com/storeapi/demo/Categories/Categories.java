package com.storeapi.demo.Categories;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Categories {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int CategoryId;
	private String Category;
	public Categories() {

	}
	public Categories(int categoryId, String category) {
		super();
		CategoryId = categoryId;
		Category = category;
	}
	public int getCategoryId() {
		return CategoryId;
	}
	public void setCategoryId(int categoryId) {
		CategoryId = categoryId;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	@Override
	public String toString() {
		return "Categories [CategoryId=" + CategoryId + ", Category=" + Category + "]";
	}
	
}
