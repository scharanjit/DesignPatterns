package design.patterns.adaptor;

public class BicycleAdaptor implements Vehicle {

    private Bicycle bicycle;

    public BicycleAdaptor(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    public void accelerate() {
        this.bicycle.go();
    }

    //therefore we hide the Bicycle class properities behind the Vehicle Interface

}
