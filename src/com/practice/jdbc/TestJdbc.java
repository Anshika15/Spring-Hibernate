package com.practice.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {

		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String user = "root";
		String pwd = " ";
		try {
			System.out.println("Connecting to Databse " + jdbcUrl);
			 Class.forName("com.mysql.jdbc.Driver");
			 Connection conn = DriverManager.getConnection(jdbcUrl, user, pwd);
			
			System.out.println("Connection Successful");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
