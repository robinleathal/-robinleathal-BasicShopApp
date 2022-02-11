package com.entity;

public class Product {
	private int pId;
	private String productName;
	private double productPrice;
	private int productQty;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int pId, String productName, double productPrice, int productQty) {
		super();
		this.pId = pId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQty = productQty;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductQty() {
		return productQty;
	}
	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productQty=" + productQty + "]";
	}
	
	
	
}
