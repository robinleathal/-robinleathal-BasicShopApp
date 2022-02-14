package com.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.client.ShopClient;
import com.dao.impl.ProductDAOImpl;
import com.entity.Product;

public class UserDetails {
	Scanner sc = new Scanner(System.in);
	
	ProductDAOImpl pDaoImpl = new ProductDAOImpl();

	public void adminMenu() {
		while (true) {
			System.out.println("Admin Menu");
			System.out.println("1. Add products");
			System.out.println("2. View All products");
			System.out.println("3. View A products");
			System.out.println("4. Delete products");
			System.out.println("5. Update products");
			System.out.println("6. Back");
			System.out.println("Enter Choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				pDaoImpl.addProduct();
				break;
			case 2:
				List<Product> productList = pDaoImpl.viewAllProducts();
				//pDaoImpl.viewAllProducts();
				System.out.println("*****************************************");
				System.out.println("Product ID \t  Prouct NAME\t Product Price \t Product Qty");
				System.out.println("*****************************************");
				
				for (Product p : productList) {
					System.out.println(p.getpId() + "\t\t" + p.getProductName() + "\t\t" + p.getProductPrice() + "\t\t" + p.getProductQty());
					
				}
				
				break;
			case 3:
				System.out.println("Enter Product Id");
				
				int id= sc.nextInt();
				Product p = pDaoImpl.viewProduct(id);
				//pDaoImpl.viewProduct(id);
				System.out.println("*****************************************");
				System.out.println("Product ID \t  Prouct NAME\t Product Price \t Product Qty");
				System.out.println("*****************************************");
				if (p != null) {
					System.out.println(p.getpId() + "\t\t" + p.getProductName() + "\t\t" + p.getProductPrice() + "\t\t" + p.getProductQty());
					//System.out.println(pDaoImpl.viewProduct(id));
				}
				break;
			case 4:
				System.out.println("Enter Product Id");
				int id1= sc.nextInt();
				pDaoImpl.deleteProduct(id1);
				break;
			case 5:
				System.out.println("Enter Product Id");
				int id2= sc.nextInt();
				pDaoImpl.updateProduct(id2);
				break;
			case 6:
				ShopClient.main(null);
				break;
			default:
				System.out.println("Choose between 1 to 6");
			}
		}

	}

	public void customerMenu() {
		while (true) {
			System.out.println("Customer Menu");

			System.out.println("1. View All products");
			System.out.println("2. View A product");
			System.out.println("3. Buy a product");
			System.out.println("4. Back");
			System.out.println("Enter Choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				List<Product> productList = pDaoImpl.viewAllProducts();
				//pDaoImpl.viewAllProducts();
				System.out.println("*****************************************");
				System.out.println("Product ID \t  Prouct NAME\t Product Price \t Product Qty");
				System.out.println("*****************************************");
				
				for (Product p : productList) {
					System.out.println(p.getpId() + "\t\t" + p.getProductName() + "\t\t" + p.getProductPrice() + "\t\t" + p.getProductQty());
					
				}
				break;
			case 2:
				System.out.println("Enter Product Id");
				
				int id= sc.nextInt();
				Product p = pDaoImpl.viewProduct(id);
				//pDaoImpl.viewProduct(id);
				System.out.println("*****************************************");
				System.out.println("Product ID \t  Prouct NAME\t Product Price \t Product Qty");
				System.out.println("*****************************************");
				if (p != null) {
					System.out.println(p.getpId() + "\t\t" + p.getProductName() + "\t\t" + p.getProductPrice() + "\t\t" + p.getProductQty());
					//System.out.println(pDaoImpl.viewProduct(id));
				}
				break;
			case 3:
				
				pDaoImpl.buyProduct();
				break;
			case 4:
				ShopClient.main(null);
				break;
			default:
				System.out.println("Choose between 1 to 4");
			}
		}
	}
}
