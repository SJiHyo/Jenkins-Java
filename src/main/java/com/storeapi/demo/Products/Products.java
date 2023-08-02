package com.storeapi.demo.Products;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Products {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int ProductId;
	private String Title;
	private Float Price;
	@Lob 
	@Column(name="CONTENT", length=512)
	private String Description;
	private String Category;
	private String Image;
	private Float Rating;
	private int Count;
	
	public Products() {

	}

	public Products(int productId, String title, Float price, String description, String category, String image,
			Float rating, int count) {
		super();
		ProductId = productId;
		Title = title;
		Price = price;
		Description = description;
		Category = category;
		Image = image;
		Rating = rating;
		Count = count;
	}

	public int getProductId() {
		return ProductId;
	}

	public void setProductId(int productId) {
		ProductId = productId;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public Float getPrice() {
		return Price;
	}

	public void setPrice(Float price) {
		Price = price;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public String getImage() {
		return Image;
	}

	public void setImage(String image) {
		Image = image;
	}

	public Float getRating() {
		return Rating;
	}

	public void setRating(Float rating) {
		Rating = rating;
	}

	public int getCount() {
		return Count;
	}

	public void setCount(int count) {
		Count = count;
	}

	@Override
	public String toString() {
		return "Products [ProductId=" + ProductId + ", Title=" + Title + ", Price=" + Price + ", Description="
				+ Description + ", Category=" + Category + ", Image=" + Image + ", Rating=" + Rating + ", Count="
				+ Count + "]";
	}

	public Object get() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
