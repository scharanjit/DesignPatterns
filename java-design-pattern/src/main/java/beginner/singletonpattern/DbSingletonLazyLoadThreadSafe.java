package beginner.singletonpattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingletonLazyLoadThreadSafe {

  private static volatile DbSingletonLazyLoadThreadSafe instance = null;
  //it will be thread safe inside JVM

  private static volatile Connection conn = null;

  private DbSingletonLazyLoadThreadSafe(){

    try {
      DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
    }catch (SQLException e){

      e.printStackTrace();
    }


    if(conn != null) {
      throw new RuntimeException("Use getInstance() method to create ");
      //it will protect us from having a reflection class go ahead and create an instance of this
    }

    if(instance != null) {
      throw new RuntimeException("Use getInstance() method to create ");
      //it will protect us from having a reflection class go ahead and create an instance of this
    }


  }


  // double check locking mechanism and synchronised check
  // if we make this whole method synchronise, every time it gonna ask for instance
  // that will be performance hit. It will slow it down
  //
  public static DbSingletonLazyLoadThreadSafe getInstance() {
    if(instance == null){
      synchronized(DbSingletonLazyLoadThreadSafe.class) {
        if(instance == null) { //for first run
          instance = new DbSingletonLazyLoadThreadSafe();
        }
      }
    }
    return instance;
  }


  public static Connection getConnection() {
    if(conn == null){
      synchronized(DbSingletonLazyLoadThreadSafe.class) {
        if(conn == null) { //for first run

          String url = "jdbc:derby:memory:codejava/webdb;create=true";
          try {
            conn = DriverManager.getConnection(url);
          } catch (SQLException e) {
            e.printStackTrace();
          }
        }
      }
    }
    return conn;
  }
}
