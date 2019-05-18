package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
	String jdbcIUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?characterEncoding=UTF8";
	String user = "hbstudent";
	String pass = "hbstudent";
	
	try {
		System.out.println("Connececting to database" + jdbcIUrl);
		Connection myConn =
			DriverManager.getConnection(jdbcIUrl, user, pass);
		System.out.println("Connection Successfull!");
		
	}catch(Exception exc) {
		exc.printStackTrace();
	}
	
	
	}

}
