package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Updation {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "root");
		
		PreparedStatement ps=con.prepareStatement("update books set book_cost=? where sno=?");
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the updated cost");
		int updatedcost=scan.nextInt();
		ps.setInt(1, updatedcost);
		
		System.out.println("Enter the sno that need to be updated");
		int sno=scan.nextInt();
		ps.setInt(2, sno);
		
		ps.execute();
		
		
		ps.close();

	}

}
