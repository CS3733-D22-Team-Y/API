package edu.wpi.cs3733.d22.teamY.Model;

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
    /*
    try {
      Statement s = dbConnection.createStatement();
      String sql =
          "CREATE TABLE SECURITYSERVICEREQ "
              + "(id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), "
              + " nodeID VARCHAR(255), "
              + " priority VARCHAR(255), "
              + " status VARCHAR(255),"
              + " assignedEmployee VARCHAR(255), "
              + " additionalNotes VARCHAR(255), "
              + " CONSTRAINT primary_key PRIMARY KEY (id))";
      s.executeUpdate(sql);
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
     */
  }

  public static Connection getConnection() {
    return dbConnection;
  }
}
