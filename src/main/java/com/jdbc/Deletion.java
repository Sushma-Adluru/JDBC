package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Deletion {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "root");
		
		PreparedStatement ps=con.prepareStatement("delete from books where sno=?");
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the sno that need to be deleted");
		int sno=scan.nextInt();
		ps.setInt(1, sno);
		ps.execute();
		ps.close();

	}

}
