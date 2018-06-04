package Java8;


import java.util.function.Consumer;

/*

    Consumer is single argument functional interface like Predicate but it does not return any value.
     As Consumer is functional interface, so it  can be used as assignment target for lambda expressions.
    It has a functional method called accept(Object).

 */
public class ConsumerInterfaceExample {

    public static void main(String[] args) {
        Consumer consumerString = s -> System.out.println(s);
        consumerString.accept("Test");
    }
}
