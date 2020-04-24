package beginner.prototypepattern;

import java.util.ArrayList;
import java.util.List;

public class PrototypeEveryDayDemo {

  public static void main(String[] args) {
    String sql = "select * from movies where title = ?";

    List<String> parameters = new ArrayList<String>();

    Record record = new Record();

    Statement firsStatement = new Statement(sql,parameters, record);

    System.out.println(firsStatement.getSql());
    System.out.println(firsStatement.getParameters());
    System.out.println(firsStatement.getRecord());

    Statement secondStatement = firsStatement.clone(); //shallow copy of clone

    System.out.println(secondStatement.getSql());
    System.out.println(secondStatement.getParameters());
    System.out.println(secondStatement.getRecord());




  }

}
