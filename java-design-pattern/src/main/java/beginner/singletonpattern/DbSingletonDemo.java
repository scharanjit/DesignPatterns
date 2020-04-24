package beginner.singletonpattern;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Test DbSingleton
 */
public class DbSingletonDemo {

  public static void main(String[] args) {
    DbSingleton instance = DbSingleton.getInstance();
    System.out.println(instance);
    DbSingleton instance1 = DbSingleton.getInstance();
    System.out.println(instance1);

    DbSingletonLazyLoad instanceLazyLoad = DbSingletonLazyLoad.getInstance();
    System.out.println(instanceLazyLoad);
    DbSingletonLazyLoad  instance2 = DbSingletonLazyLoad.getInstance();
    System.out.println(instance2);


    DbSingletonLazyLoadThreadSafe instanceLazyLoadThreadSafe = DbSingletonLazyLoadThreadSafe.getInstance();
    System.out.println(instanceLazyLoadThreadSafe);
    DbSingletonLazyLoadThreadSafe  instance3 = DbSingletonLazyLoadThreadSafe.getInstance();
    System.out.println(instance3);

    System.out.println("-------------------------------------");
    System.out.println("-------------------------------------");
    System.out.println("-------------------------------------");

    DbSingletonLazyLoadThreadSafe dbSingletonLazyLoadThreadSafe = DbSingletonLazyLoadThreadSafe.getInstance();


    long timeBefore = 0;
    long timeAfter = 0;

    timeBefore = System.currentTimeMillis();
    Connection connection = dbSingletonLazyLoadThreadSafe.getConnection();
    timeAfter = System.currentTimeMillis();

    System.out.println(timeAfter - timeBefore);

    Statement statement ;

    try {
      statement = connection.createStatement();
      int count = statement.executeUpdate("CREATE  TABLE "
          + "ADDRESS (ID INT , StreetName VARCHAR (20), City VARCHAR(20) )");
      System.out.println("Table Created "+count);
      statement.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }

    timeBefore = System.currentTimeMillis();
    Connection connection1 = dbSingletonLazyLoadThreadSafe.getConnection();
    timeAfter = System.currentTimeMillis();

    System.out.println(timeAfter - timeBefore);
    //Time to get second connection would be zero i.e. optimised code

    System.out.println(connection1);

    Statement statement1;
    try {
      statement1 =connection1.createStatement();

      ResultSet resultSet = statement1.executeQuery("SELECT * FROM ADDRESS");
      System.out.println(resultSet);
    } catch (SQLException e) {
      e.printStackTrace();
    }

  }

}
