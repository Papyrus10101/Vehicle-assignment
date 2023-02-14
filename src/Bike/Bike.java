package Bike;

import Vehicle.Vehicle;

public class Bike extends Vehicle {

    private boolean  engine, accelerate, Break;


    public Bike(String model, String make, int numberOfWheels, double topSpeed, boolean airCon, boolean handBreak, boolean sound, boolean engine) {
        super(model, make, numberOfWheels, topSpeed);
        this.engine = engine;

    }

    public boolean hasEngine() {
        return engine;
    } 

    public void setEngine(boolean engine){
        this.engine = engine;
    }
    public boolean hasBreak() {
        return Break;
    } 

    public void setBreak(boolean Break){
        this.Break = Break;
    }

    public boolean hasAcclerate() {
        return accelerate;
    } 

    public void setAccelerate(boolean accelerate){
        this.accelerate = accelerate;
    }

    public void getBikeInformation() {
        System.out.println("Model of Bike: " + this.getModel() );
        System.out.println("Make of Bike: " + this.getMake() );
        System.out.println("Number of wheels in Bike: " + this.getNumberOfWheels() );
        System.out.println("Top Speed of Bike: " + this.getTopSpeed() );
        System.out.println("Does this Bike have an engine?: " + this.hasEngine() );
        System.out.println("Does this Bike have a Break?: " + this.hasBreak() );
        System.out.println("Is this Bike accelerating?: " + this.hasAcclerate() );
    }
}