package com.storeapi.demo.Categories;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Categories {
	
	@Id
	private int CategoryId;
	private String CategoryName;
	
	public Categories() {
		
	}

	public Categories(int categoryId, String categoryName) {
		super();
		CategoryId = categoryId;
		CategoryName = categoryName;
	}

	public int getCategoryId() {
		return CategoryId;
	}

	public void setCategoryId(int categoryId) {
		CategoryId = categoryId;
	}

	public String getCategoryName() {
		return CategoryName;
	}

	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}

	@Override
	public String toString() {
		return "Categories [CategoryId=" + CategoryId + ", CategoryName=" + CategoryName + "]";
	}
	
}
