package com.rosemberg.ocp.elevator.course;


public class Building {

    Elevator e1 = new Elevator(); //Escenario B
    Elevator e2 = new Elevator();

    public void operateElevators(){
        Elevator e1 = new Elevator(); // Escenario A
        Elevator e2 = new Elevator();
    }
}
