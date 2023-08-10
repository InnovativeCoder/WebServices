package com.jdbcproj.jdbcproject;
import java.sql.*;

import com.mysql.cj.Query;

public class App {
  public static void main(String[] args) throws Exception {
	  
	String url = "jdbc:mysql://localhost:3306/practice";
	String username = "root";
	String pass = "pass123!";
	String query = "select * from dummy";
	
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection(url, username, pass );
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery(query);
    
    String userData = "";
    while(rs.next()) {
      userData = rs.getInt(1)+":"+rs.getString(2);    
      System.out.println(userData);
    }
    
//    rs.next();
//    String userData = rs.getInt(1)+":"+rs.getString(2);
//    rs.next();
//    String name = rs.getString("name");
//    
//    System.out.println(name);
//    System.out.println(userData);
    
    st.close();
    con.close();
  }
}
