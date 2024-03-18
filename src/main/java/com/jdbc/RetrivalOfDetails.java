package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class RetrivalOfDetails {
	public static void main(String [] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "root");
		
		PreparedStatement ps=con.prepareStatement("select * from books where book_cost=?");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the cost of the book");
		int cost=scan.nextInt();
		ps.setInt(1, cost);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			
		}
		ps.close();

}
}
