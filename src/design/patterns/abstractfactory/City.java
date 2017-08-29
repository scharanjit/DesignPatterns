package design.patterns.abstractfactory;

public class City implements  Car {

    @Override
    public void drive(){
        System.out.println("Driving Honda City...");
    }
}
