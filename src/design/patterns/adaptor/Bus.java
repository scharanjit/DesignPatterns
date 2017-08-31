package design.patterns.adaptor;

public class Bus implements Vehicle {

    @Override
    public void accelerate() {
        System.out.println("Driving Bus ..");
    }
}
