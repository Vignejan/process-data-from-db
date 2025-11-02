package com.Management;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DataBaseConnection {
	
	public static Connection getConnetion() {
		
		String url="jdbc:mysql://localhost:3306/Products_Fetching";
		String userName="root";
		String password="dinu";
		String mySql_Driver="com.mysql.cj.jdbc.Driver";
		
			
		Connection con=null;
		
		try {
			
			//load the driver class
			Class.forName(mySql_Driver);
			
//            create the connection
			con=DriverManager.getConnection(url,userName,password);
			
			System.out.println("database connected");
			
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("database not connected");
			e.printStackTrace();
		}
		
		
		
		return con;
	}

}
