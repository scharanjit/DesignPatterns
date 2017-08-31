package design.patterns.adaptor;

public class Car implements  Vehicle {

    @Override
    public void accelerate() {
        System.out.println("Driving Car ..");
    }
}
