package com;

import java.util.Scanner;

import com.Management.DataBaseConnection;
import com.Management.Products_Management;
import com.Module.Products;
import com.Service.Product_Service;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	
		DataBaseConnection db=new DataBaseConnection();
		db.getConnetion();
		
		Products_Management prodManagemnt=new Products_Management();
		
		Product_Service product_Service=new Product_Service();
		product_Service.processData();
		
		 while (true) {
	            System.out.println("\n----------------------------");
	            System.out.println("Choose an option:");
	            System.out.println("1. Insert Product");
	            System.out.println("2. View Products");
	            System.out.println("3. Update Product");
	            System.out.println("4. Delete Product");
	            System.out.println("5. Exit");
	            System.out.println("----------------------------");
	            System.out.print("Enter your choice: ");

	           int choice=sc.nextInt();
	           

	            switch (choice) {
	                case 1:
	                    insertProduct(sc, prodManagemnt);
	                    break;
	                case 2:
	                	prodManagemnt.getInfo(); // Implement getInfo() to display all products
	                    break;
	                case 3:
	                    System.out.println("Update functionality not implemented yet.");
	                    break;
	                case 4:
	                    System.out.println("Delete functionality not implemented yet.");
	                    break;
	                case 5:
	                    System.out.println("Exiting program. Goodbye!");
	                    sc.close();
	                    return;
	                default:
	                    System.out.println("⚠️ Invalid choice! Please select 1-5.");
	            }
		 }
	}
	
	private static void insertProduct(Scanner sc, Products_Management prodManagemnt) {
		 try {
			 
			  System.out.print("Enter Title: ");
		      String title = sc.nextLine();

		      System.out.print("Enter Description: ");
		      String description = sc.nextLine();

		      System.out.print("Enter Category: ");
		      String category = sc.nextLine();

		      System.out.print("Enter Price: ");
		      double price = Double.parseDouble(sc.nextLine());

		      System.out.print("Enter Discount Percentage: ");
		      double discountPercentage = Double.parseDouble(sc.nextLine());

		      System.out.print("Enter Rating: ");
		      double rating = Double.parseDouble(sc.nextLine());
		      System.out.print("Enter Stock Quantity: ");
		      int stock = Integer.parseInt(sc.nextLine());

		      System.out.print("Enter Brand: ");
		      String brand = sc.nextLine();

		      System.out.print("Enter SKU: ");
		      String sku = sc.nextLine();

		      System.out.print("Enter Weight: ");
		      double weight = Double.parseDouble(sc.nextLine());

		      System.out.print("Enter Warranty Information: ");
		      String warrantyInformation = sc.nextLine();

		      System.out.print("Enter Shipping Information: ");
		      String shippingInformation = sc.nextLine();

		      System.out.print("Enter Availability Status: ");
		      String availabilityStatus = sc.nextLine();

		      System.out.print("Enter Return Policy: ");
		      String returnPolicy = sc.nextLine();

		      System.out.print("Enter Minimum Order Quantity: ");
		      int minimumOrderQuantity = Integer.parseInt(sc.nextLine());

		      System.out.print("Enter Thumbnail URL: ");
		            String thumbnail = sc.nextLine();

		            // Insert product into DB
		      prodManagemnt.putInfo(title, description, category, price, discountPercentage, rating,
		                                stock, brand, sku, weight, warrantyInformation, shippingInformation,
		                                availabilityStatus, returnPolicy, minimumOrderQuantity, thumbnail);

		        } catch (Exception e) {
		            System.err.println("❌ Error while inserting product data: " + e.getMessage());
		            e.printStackTrace();
		        }
		    
		


		}


}
