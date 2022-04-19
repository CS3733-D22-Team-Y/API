package edu.wpi.teamY.Model;

import java.sql.*;

public class DatabaseConnection {
	private static Connection dbConnection = null;

	static {
		String url = "jdbc:derby:SecurityServiceDB;create=true";
		String user = "admin";
		String password = "admin";

		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			dbConnection = DriverManager.getConnection(url);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return dbConnection;
	}
}
