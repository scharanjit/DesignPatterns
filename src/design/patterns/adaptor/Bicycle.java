package design.patterns.adaptor;

public class Bicycle {

    //since the bicycle wont accelerate
    //so we have go method
    //we want to handle bicycle as Car and Bus
    //so we create Bicycle adaptor
    public void go() {
        System.out.println("Going by Bicycle...");
    }
}
