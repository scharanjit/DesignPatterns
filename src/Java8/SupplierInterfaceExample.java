package Java8;


import java.util.function.Supplier;

/**
 * Consumer is single argument functional interface like Predicate and
 * used to get objects. As Supplier is functional interface, so it  can be used as assignment target for lambda expressions.
 * It has a functional method called get()
 */
public class SupplierInterfaceExample {

    public static void main(String[] args) {


        Supplier supplier = () -> "Test Supplier";
        System.out.println(supplier.get());
    }
}
