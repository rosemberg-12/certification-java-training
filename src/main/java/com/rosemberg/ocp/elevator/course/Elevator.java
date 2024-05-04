package com.rosemberg.ocp.elevator.course;

public class Elevator {

    int currentLevel;
    boolean doorClosed;
    
    public void goUp(){
        this.closeDoor();
        currentLevel++;
        this.openDoor();

    }

    public void goDown(){
        this.closeDoor();
        currentLevel--;
        this.openDoor();
    }
    
    public void closeDoor(){
        this.doorClosed=true;
    }
    
    public void openDoor(){
        this.doorClosed=false;
    }

}
