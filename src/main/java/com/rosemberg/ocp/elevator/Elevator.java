/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rosemberg.ocp.elevator;

/**
 *
 * @author Rosemberg
 */
public class Elevator {
    
    private int floorsQuantity;
    private int currentFloor;
    private boolean isEnabled;
    
    public Elevator(int floorQuantity){
        this.floorsQuantity= floorQuantity;
        this.currentFloor=0;
        this.isEnabled=true;
    }
    
    public int getCurrentFloor(){
        return this.currentFloor;
    }
        
    public void goTo(int newFloor){
        if (newFloor>=0 && newFloor<=this.floorsQuantity){
            this.currentFloor= newFloor;
        }
    }
    
    public void up(){
        if(this.currentFloor<this.floorsQuantity){
            this.currentFloor++;
        }
    }
    
    public void down(){
        if(this.currentFloor>1){
            this.currentFloor++;
        }
    }
    
    public void switchOn(){
        this.isEnabled= true;
    }
    
    public void switchDown(){
        this.isEnabled= false;
    }

}