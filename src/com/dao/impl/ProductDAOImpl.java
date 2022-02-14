package com.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dao.ProductDAO;
import com.entity.Product;

public class ProductDAOImpl implements ProductDAO {
	List<Product> productList = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	@Override
	public void addProduct() {
		int k = 1;
		while (k == 1) {
			System.out.println("Add product");
			System.out.println("Enter Product ID");
			int pid =sc.nextInt();
			System.out.println("Enter Product Name");
			String pName= sc.next();
			System.out.println("Enter Product Quantity");
			int qty = sc.nextInt();
			System.out.println("Enter Product Price");
			double price= sc.nextDouble();
			Product pObj = new Product(pid, pName, price, qty);
			productList.add(pObj);
			System.out.println("Product Registred Successfully");
			System.out.println("Do You Want to One more Record 1)Yes 2)No");
			k = sc.nextInt();
		}

	}

	@Override
	public List<Product> viewAllProducts() {
		// TODO Auto-generated method stub
		return productList;
	}

	@Override
	public Product viewProduct(int pId) {
		for (Product p : productList) {
			if (p.getpId() == pId) {
				return p;
			}
		}
		return null;
	}

	@Override
	public void updateProduct(int pId) {
		int j=0;
		for (Product p : productList) {
			if (p.getpId() == pId) {
				++j;
				System.out.println("Choose What you want to update for product.");
				System.out.println("1. Product Name, 2. Product Quantity, 3. Product Price");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter Product Name");
					p.setProductName(sc.next());
					System.out.println("Product Name is updated");
					break;
				case 2:
					System.out.println("Enter Product Quantity");
					p.setProductQty(sc.nextInt());
					System.out.println("Product Quantity updated Sucessfully");
					break;
				case 3:
					System.out.println("Enter Product Price");
					p.setProductPrice(sc.nextDouble());
					System.out.println("Product Price updated Sucessfully");
					break;
				default:
					System.out.println("Choose between 1 to 3");

				}
			}
		}
		if (j==0) {
			System.out.println("Product Doest Not Exist");
		}

	}
	
	public void buyProduct() {
		System.out.println("Enter Product Id you want to buy");
		int id = sc.nextInt();
		
		for (Product p : productList) {
			if (p.getpId() == id) {
				int qty = p.getProductQty();
				qty-=1;
				p.setProductQty(qty);
				System.out.println("Thank you for your purchase.");
				break;
			} else {
				System.out.println("Products doesn't match.");
			}
		}
	}

	@Override
	public void deleteProduct(int pId) {
		int j = 0;
		for (Product p : productList) {
			if (p.getpId() == pId) {
				++j;
				productList.remove(pId);
				System.out.println("Product is Deleted SuccessFully");
				break;
			}
		}
		if (j==0) {
			System.out.println("Product Doest Not Exist");
		}

	}
	
	

}
