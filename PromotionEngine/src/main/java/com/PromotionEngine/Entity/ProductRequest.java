package com.PromotionEngine.Entity;

public class ProductRequest {
	public String productName;
	public int quantity;

	
	
	public ProductRequest(String productName, int quantity) {
		super();
		this.productName = productName;
		this.quantity = quantity;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
