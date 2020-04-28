package beginner.two.builderpattern;

public class StringBuilderExample {

  public static void main(String[] args) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("This is an examplewithoutbridge of ");
    stringBuilder.append("the builder pattern.  ");
    stringBuilder.append("It has method to append ");
    stringBuilder.append("almost everything we want to be string ");
    stringBuilder.append(42);
    System.out.println(stringBuilder.toString());
  }

}
