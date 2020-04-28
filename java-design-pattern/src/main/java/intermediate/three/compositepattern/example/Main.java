package intermediate.three.compositepattern.example;

public class Main {

  public static void main(String[] args) {

    Group group1 = new Group();
    group1.add(new Shape()); //circle
    group1.add(new Shape()); //circle


    Group group2 = new Group();
    group2.add(new Shape()); //square
    group2.add(new Shape()); //square



    Group group = new Group();
    group.add(group1);
    group.add(group2);
    group.render();
    group.move();
  }

}
