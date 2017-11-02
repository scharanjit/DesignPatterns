package design.patterns.abstractfactory;

//        With the Factory pattern, you produce implementations (Apple, Banana, Cherry, etc.)
//        of a particular interface -- say, IFruit.
//
//        With the Abstract Factory pattern, you produce implementations of a particular
//        Factory interface -- e.g., IFruitFactory. Each of those knows
//        how to create different kinds of fruit.

//there are two level of interface in abstract factory
//der is single level of interface in factory method

public class AbstractFactoryTest {

    public static void main(String[] args) {

        //now think we need a City car
        //first we need honda car factory

        CarFactory hondaCarFactory = FactoryProducer.getCarFactory("honda");
        //after getting hondaCarFactory instance
        Car brio = hondaCarFactory.createCar("brio");
        brio.drive();

        Car city = hondaCarFactory.createCar("city");
        city.drive();

        CarFactory hyundaiCarFactory = FactoryProducer.getCarFactory("hyundai");
        //after getting hondaCarFactory instance
        Car i10 = hyundaiCarFactory.createCar("i10");
        i10.drive();

        Car i20 = hyundaiCarFactory.createCar("i20");
        i20.drive();

    }
}
