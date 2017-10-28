package design.patterns.z.problems10.educative;

import design.patterns.z.problems10.educative.UpDownEnum;

import java.util.TreeSet;

public class ElevatorCabin {

    public int currentFloor = 0;
    public UpDownEnum direction = UpDownEnum.UP;
    public TreeSet<Integer> callingFloorList = new TreeSet<Integer>();

    public void add(Integer floor) {
        callingFloorList.add(floor);
    }

    public Integer gotoNext() {
        Integer nextFloor = currentFloor;
        switch (direction) {
            case UP:
                for (Integer floor : callingFloorList) {
                    if (floor > nextFloor) {
                        nextFloor = floor;
                        direction = UpDownEnum.UP;
                        break;
                    }
                }

                if (nextFloor == currentFloor) {
                    for (Integer floor : callingFloorList.descendingSet()) {
                        if (floor < nextFloor) {
                            nextFloor = floor;
                            direction = UpDownEnum.DOWN;
                            break;
                        }
                    }
                }
                break;
            case DOWN:
                for (Integer floor : callingFloorList.descendingSet()) {
                    if (floor < nextFloor) {
                        nextFloor = floor;
                        direction = UpDownEnum.DOWN;
                        break;
                    }
                }

                if (nextFloor == currentFloor) {
                    for (Integer floor : callingFloorList) {
                        if (floor > nextFloor) {
                            nextFloor = floor;
                            direction = UpDownEnum.UP;
                            break;
                        }
                    }
                }
        }
        callingFloorList.remove(nextFloor);
        currentFloor = nextFloor;
        return nextFloor;
    }
}