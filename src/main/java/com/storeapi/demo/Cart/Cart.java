package com.storeapi.demo.Cart;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CartId;
	private int CustomerId;
	private String Title;
	private String Image;
	private Float Price;
	private String Category;
	private Float Total;
	
	public Cart() {
		
	}

	public Cart(int cartId, int customerId, String title, String image, Float price, String category, Float total) {
		super();
		CartId = cartId;
		CustomerId = customerId;
		Title = title;
		Image = image;
		Price = price;
		Category = category;
		Total = total;
	}

	public int getCartId() {
		return CartId;
	}

	public void setCartId(int cartId) {
		CartId = cartId;
	}

	public int getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getImage() {
		return Image;
	}

	public void setImage(String image) {
		Image = image;
	}

	public Float getPrice() {
		return Price;
	}

	public void setPrice(Float price) {
		Price = price;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public Float getTotal() {
		return Total;
	}

	public void setTotal(Float total) {
		Total = total;
	}

	@Override
	public String toString() {
		return "Cart [CartId=" + CartId + ", CustomerId=" + CustomerId + ", Title=" + Title + ", Image=" + Image
				+ ", Price=" + Price + ", Category=" + Category + ", Total=" + Total + "]";
	}
	
}
