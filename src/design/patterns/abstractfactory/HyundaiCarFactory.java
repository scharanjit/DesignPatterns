package design.patterns.abstractfactory;

public class HyundaiCarFactory implements CarFactory{

    @Override
    public Car createCar(String carType){

        if("i10".equalsIgnoreCase(carType)){
            return new i10();
        }

        if("i20".equalsIgnoreCase(carType)){
            return new i20();
        }

        return null;
    }

}
