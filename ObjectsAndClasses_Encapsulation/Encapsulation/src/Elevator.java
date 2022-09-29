public class Elevator {
    public int currentFloor = 1;
    public int minFloor;
    public int maxFloor;

    public Elevator(int minFloor, int maxFloor){
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }
    public void moveDown(){
        currentFloor -= 1;
    }
    public void moveUp(){
        currentFloor += 1;
    }
    public void move(int floor){
        boolean availableFloors = floor >= minFloor && floor <= maxFloor;
        if(availableFloors && floor > currentFloor){
            while (currentFloor != floor){
                moveUp();
                System.out.println(getCurrentFloor());
            }
        } else if (availableFloors && floor < currentFloor) {
            while (currentFloor != floor){
                moveDown();
                System.out.println(getCurrentFloor());
            }
        } else if (availableFloors && floor == currentFloor){
            return;
        }else {
            System.out.println("Недоступный этаж!");
        }
    }
}
