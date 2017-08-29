package design.patterns.factory;

/**
 * 1.) factory design pattern does not expose the actual class
 * 2.)If a new class is added(means new functionality), change required only @FactoryMethod class
 * No change at client classes
 *
 */
public class FactoryMain {

    public static void main(String[] args) {
        FactoryMethod factoryMethod = new FactoryMethod();

        OS obj = factoryMethod.getInstance("iOS");
        obj.spec();

        OS obj1 = factoryMethod.getInstance("Linux");
        obj1.spec();

        OS obj2 = factoryMethod.getInstance("kuchbhi");
        obj2.spec();


    }
}
