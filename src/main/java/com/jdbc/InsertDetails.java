package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertDetails {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "root");
		
		PreparedStatement ps=con.prepareStatement("insert into Books (sno, book_name,book_cost) values (?,?,?)");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no of values");
		int n=scan.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("enter the sno");
			int sno=scan.nextInt();
			System.out.println("enter the book name");
			String bookName=scan.next();
			System.out.println("Enter the book cost");
			int bookCost=scan.nextInt();
			
			ps.setInt(1, sno);
			ps.setString(2, bookName);
			ps.setInt(3, bookCost);	
			ps.execute();
		}
		
		
		ps.close();
		
		
		
	}

}
