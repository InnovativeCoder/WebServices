package com.jdbcproj.jdbcproject;
import java.sql.*;

public class App {
  public static void main(String[] args) throws Exception {
	  
	String url = "jdbc:mysql://localhost:3306/practice";
	String username = "root";
	String pass = "";
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection(url, username, pass );
  }
}
