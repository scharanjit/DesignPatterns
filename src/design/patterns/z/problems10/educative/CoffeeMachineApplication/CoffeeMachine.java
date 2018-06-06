package design.patterns.z.problems10.educative.CoffeeMachineApplication;

public interface CoffeeMachine {
    Coffee brewEspresso();

    Coffee brewFilterCoffee();

    Coffee brewCoffee(CoffeeSelection selection) throws CoffeeException;
}
