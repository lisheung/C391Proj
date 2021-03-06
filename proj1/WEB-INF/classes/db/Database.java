package db;

import java.sql.*;

public class Database {

	public Connection conn;
	public String username;
	public String password;

	public Database() {
		conn = null;
		username = "bjw1";
		password = "02cambria";
	}

	public Connection connect() {
		String driverName = "oracle.jdbc.driver.OracleDriver";
	  // String dbString = "jdbc:oracle:thin:@localhost:1525:crs"; // from home
	  String dbString = "jdbc:oracle:thin:@gwynne.cs.ualberta.ca:1521:CRS"; // from school

	    try {
	    	Class drvClass = Class.forName(driverName);
	    	DriverManager.registerDriver((Driver)drvClass.newInstance());
	    	conn = DriverManager.getConnection(dbString, username, password);
	    } catch(Exception e) {
	    	System.out.println("<hr>" + e.getMessage() + "</hr>");
	    }
	    return conn;
	}
	
	public void close(Connection conn, Statement statement, ResultSet results) {
	  if (conn != null) {
		  try {
		  statement.close();
		  } catch (SQLException e) {
		  e.printStackTrace();
		  }
		}
		if (statement != null) {
		  try {
		  statement.close();
		  } catch (SQLException e) {
		  e.printStackTrace();
		  }
		}
		if (results != null) {
		  try {
		  statement.close();
		  } catch (SQLException e) {
		  e.printStackTrace();
		  }
	  }
	}
}
