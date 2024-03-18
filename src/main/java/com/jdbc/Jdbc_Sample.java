package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_Sample {
	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{
		//load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		//Establish connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "root");
		
		
		//Create Statement
		Statement st=con.createStatement();
		
		st.execute("create table Books (sno varchar(25), book_name varchar(25), book_cost varchar(25))");
		System.out.println("table created");
		
		st.close();
		
	}
}
