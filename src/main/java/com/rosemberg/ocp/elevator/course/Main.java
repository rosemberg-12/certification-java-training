package com.rosemberg.ocp.elevator.course;


public class Main {
    public static void main(String[] args) {
        Elevator myElevator = new Elevator();
        Elevator myOtherElevator = new Elevator();

        myElevator.currentLevel = 1;
        myOtherElevator.currentLevel = 1;

        myElevator.goUp();
        myOtherElevator.goUp();

        myElevator = new Elevator();

        System.out.println("You're in level: " + myElevator.currentLevel);

        System.out.println(new Elevator());
    }
}