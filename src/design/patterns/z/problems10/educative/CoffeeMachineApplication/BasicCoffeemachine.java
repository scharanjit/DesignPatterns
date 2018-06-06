package design.patterns.z.problems10.educative.CoffeeMachineApplication;


import java.util.Map;

public class BasicCoffeemachine implements CoffeeMachine {

    private Configuration config;
    private Map<CoffeeSelection, GroundCoffee> groundCoffee;
    private BrewingUnit brewingUnit;

    public BasicCoffeemachine(Map<CoffeeSelection, GroundCoffee> coffee){
            this.groundCoffee = coffee;
        this.brewingUnit = new BrewingUnit();
        this.config = new Configuration(30, 480);
}

    @Override
    public Coffee brewEspresso() {
        return null;
    }

    @Override
    public Coffee brewFilterCoffee() {
        // get the coffee
        GroundCoffee groundCoffee = this.groundCoffee.get(CoffeeSelection.FILTER_COFFEE);
        // brew a filter coffee
        return this.brewingUnit.brew(CoffeeSelection.FILTER_COFFEE, groundCoffee, this.config.getQuantityWater());
    }

    @Override
    public Coffee brewCoffee(CoffeeSelection selection) throws CoffeeException {
        return null;
    }

    public void addGroundCoffee(CoffeeSelection sel, GroundCoffee newCoffee) throws CoffeeException {
        GroundCoffee existingCoffee = this.groundCoffee.get(sel);
        if (existingCoffee != null) {
//            if (existingCoffee.getName().equals(newCoffee.getName())) {
//                existingCoffee.setQuantity(existingCoffee.getQuantity() + newCoffee.getQuantity())
//            } else {
//                throw new CoffeeException("Only one kind of coffee supported for each CoffeeSelection.")
//            }
        } else {
            this.groundCoffee.put(sel, newCoffee);
        }
    }
}