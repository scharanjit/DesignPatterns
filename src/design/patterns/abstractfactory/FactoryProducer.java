package design.patterns.abstractfactory;

public class FactoryProducer {

    public static CarFactory getCarFactory(String factoryType) {

        if ("hyundai".equalsIgnoreCase(factoryType)) {
            return new HyundaiCarFactory();
        }

        if ("honda".equalsIgnoreCase(factoryType)) {
            return new HondaCarFactory();
        }

        return null;
    }
}
