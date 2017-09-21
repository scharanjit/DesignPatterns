package datastructure.greedyalgo;

public class ElevatorEngine extends Thread{

    private ElevatorCabin cabin = new ElevatorCabin();
    private volatile boolean stopFlag = false;

    public void startEngine(){
        stopFlag = false;
        this.start();
    }

    public void stopEngine(){
        stopFlag = true;
    }

    public void run(){
        while(true){
            if(stopFlag){
                if(cabin.callingFloorList.isEmpty()){
                    break;
                }
            }
            Integer next = cabin.gotoNext();
            System.out.println("Next floor is "+next);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void pressButton(int floor){
        System.out.println("Pressed "+floor);
        cabin.add(floor);
    }
}