package design.patterns.adaptor;

public class TestAdaptor {

    public static void main(String[] args) {
        Vehicle bus = new Bus();
        bus.accelerate();

        Vehicle car = new Car();
        car.accelerate();

        Vehicle bicycle = new BicycleAdaptor(new Bicycle()); //we wan to transfer bicycle into vehicle
        bicycle.accelerate();

    }
}
