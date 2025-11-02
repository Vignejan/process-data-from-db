package com.Management;

import java.lang.reflect.UndeclaredThrowableException;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.*;

import com.Module.Products;

public class Products_Management {
	

	Connection con= DataBaseConnection.getConnetion();
	
	public void putInfo(String title, String description, String category, double price, double discountPercentage,
            double rating, int stock, String brand, String sku, double weight, 
            String warrantyInformation, String shippingInformation, String availabilityStatus,
            String returnPolicy, int minimumOrderQuantity, String thumbnail) throws SQLException {

				String query = "INSERT INTO Products (title, description, category, price, discountPercentage, rating, stock, " +
				           "brand, sku, weight, warrantyInformation, shippingInformation, availabilityStatus, " +
				           "returnPolicy, minimumOrderQuantity, thumbnail) " +
				           "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
				
			try (PreparedStatement pStatement = con.prepareStatement(query)) {
				
				pStatement.setString(1, title);
				pStatement.setString(2, description);
				pStatement.setString(3, category);
				pStatement.setDouble(4, price);
				pStatement.setDouble(5, discountPercentage);
				pStatement.setDouble(6, rating);
				pStatement.setInt(7, stock);
				pStatement.setString(8, brand);
				pStatement.setString(9, sku);
				pStatement.setDouble(10, weight);
				pStatement.setString(11, warrantyInformation);
				pStatement.setString(12, shippingInformation);
				pStatement.setString(13, availabilityStatus);
				pStatement.setString(14, returnPolicy);
				pStatement.setInt(15, minimumOrderQuantity);
				pStatement.setString(16, thumbnail);

			// Execute the insert
			int rowsInserted = pStatement.executeUpdate();
			
			if (rowsInserted > 0) {
			    System.out.println("✅ Product information inserted successfully!");
			}
			else {
				throw new Exception("⚠️ Something went wrong while inserting the product data.");
			}
			}
	  catch (SQLException e) {
			System.err.println("❌ Error inserting product data: " + e.getMessage());
			}
			
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Unexpected Error: "+e.getMessage());
			e.printStackTrace();
		}

              }

	public List<Products> getInfo() {
		
		List<Products> productList = new ArrayList<>();
		
	    try {
	        String query = "SELECT * FROM Products";

	        Statement statement = con.createStatement();
	        ResultSet rSet = statement.executeQuery(query);


	        while (rSet.next()) {
	            Products product = new Products();

	            product.setId(rSet.getInt("id"));
	            product.setTitle(rSet.getString("title"));
	            product.setDescription(rSet.getString("description"));
	            product.setCategory(rSet.getString("category"));
	            product.setPrice(rSet.getDouble("price"));
	            product.setDiscountPercentage(rSet.getDouble("discountPercentage"));
	            product.setRating(rSet.getDouble("rating"));
	            product.setStock(rSet.getInt("stock"));
	            product.setBrand(rSet.getString("brand"));
	            product.setSku(rSet.getString("sku"));
	            product.setWeight(rSet.getDouble("weight"));
	            product.setWarrantyInformation(rSet.getString("warrantyInformation"));
	            product.setShippingInformation(rSet.getString("shippingInformation"));
	            product.setAvailabilityStatus(rSet.getString("availabilityStatus"));
	            product.setReturnPolicy(rSet.getString("returnPolicy"));
	            product.setMinimumOrderQuantity(rSet.getInt("minimumOrderQuantity"));
	            product.setThumbnail(rSet.getString("thumbnail"));

	            productList.add(product);
	        }

	        // ✅ Display all products
	        if (productList.isEmpty()) {
	            System.out.println("⚠️ No products found in the database.");
	        } 

	    } catch (SQLException e) {
	        System.err.println("❌ SQL Error fetching product data: " + e.getMessage());
	    } catch (Exception e) {
	        System.err.println("⚠️ Unexpected Error: " + e.getMessage());
	        e.printStackTrace();
	    }
	    return productList;
	}

	}
