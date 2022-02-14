package com.dao;

import java.util.List;

import com.entity.Product;

public interface ProductDAO {
	public void addProduct();
	List<Product> viewAllProducts();
	Product viewProduct(int pId);
	void updateProduct(int pid);
	void deleteProduct(int pId);
}
