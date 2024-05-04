/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rosemberg.ocp.elevator;

/**
 *
 * @author Rosemberg
 */
public class ElevatorExercise {
    
    public static void main(String[] args){
        
        Elevator elevator= new Elevator(20);
       
        elevator.up();
        
        assert elevator.getCurrentFloor() == 1;
        
        elevator.down();
        
        assert elevator.getCurrentFloor() == 0;
        
        elevator.down();
        
        assert elevator.getCurrentFloor() == 0;
        
        elevator.goTo(20);
        
        assert elevator.getCurrentFloor() == 20;
        
        elevator.up();

        assert elevator.getCurrentFloor() == 20;
    }
    
}
