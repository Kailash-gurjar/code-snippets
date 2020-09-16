package com.iocsnippet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Component;

public class JDBCConnection {

	public static void main(String args[]) throws SQLException {
		Connection con=getConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from employee");
		while (rs.next())
			System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
		con.close();
	}
	public static Connection getConnection() {
		Connection con = null ;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}
}
