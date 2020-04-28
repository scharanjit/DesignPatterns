package intermediate.two.bridgepattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCBridgeExample {


  public static void main(String[] args) {
    try {
      DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());

      String url = "jdbc:derby:memory:codejava/webdb;create=true";

      Connection connection = DriverManager.getConnection(url);

      Statement statement = connection.createStatement();


      statement.executeUpdate("CREATE TABLE  ADDRESS (ID INT, STREETNAME VARCHAR(20) )");

      System.out.println("Table Created");

    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

}
