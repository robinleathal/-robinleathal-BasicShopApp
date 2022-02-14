package com.client;

import java.util.Scanner;

import com.dao.impl.UserDAOImpl;


public class ShopClient {
	static UserDAOImpl uDaoImplObj = new UserDAOImpl();

	public static void main(String[] args) {
		while(true) {
			System.out.println("****************************************************");
			System.out.println("Welcome to Console Shop.");
			System.out.println("1. Register.");
			System.out.println("2. Login");
			System.out.println("3. Exit");
			System.out.println("****************************************************");
			System.out.println("Enter Choice");
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				//UserDetails uDetails = new UserDetails();
				//uDetails.adminMenu();
				
				uDaoImplObj.addUsers();
				
				break;
			case 2:
				System.out.println("Login");
				uDaoImplObj.userLogin();
				
				break;
			case 3:
				System.out.println("Thx for Using App!");
				System.exit(0);
			default :
				System.out.println("Choose between 1 to 3");
			}
			sc.close();
		}
		
			
		
	}

}
