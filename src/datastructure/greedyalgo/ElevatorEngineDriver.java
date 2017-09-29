package datastructure.greedyalgo;

public class ElevatorEngineDriver {
    public static void main(String[] args) {
        ElevatorEngine engine = new ElevatorEngine();
        engine.startEngine();

        engine.pressButton(1);
        sleep();
        engine.pressButton(5);
        engine.pressButton(6);
        engine.pressButton(1);
        engine.pressButton(4);
        sleep();
        sleep();
        sleep();
        engine.pressButton(2);
        engine.pressButton(9);
        engine.pressButton(1);
        sleep();
        engine.pressButton(5);
        engine.stopEngine();
        try {
            engine.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void sleep() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
