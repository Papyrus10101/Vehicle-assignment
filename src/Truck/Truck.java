package Truck;

import Vehicle.Vehicle;

public class Truck extends Vehicle{
    private boolean airCon, handBreak, sound, engine, container, accelerate, Break;


    public Truck(String model, String make, int numberOfWheels, double topSpeed, boolean airCon, boolean handBreak, boolean sound, boolean engine, boolean container, boolean accelerate, boolean Break) {
        super(model, make, numberOfWheels, topSpeed);
        this.airCon = airCon;
        this.handBreak = handBreak;
        this.sound = sound;
        this.engine = engine;

    }

    public Truck() {

    }

    public boolean hasAirCon() {
        return airCon;
    } 

    public void setAirCon(boolean airCon){
        this.airCon = airCon;
    }

    public boolean hasHandBreak() {
        return handBreak;
    } 

    public void setHandBreak(boolean handBreak){
        this.handBreak = handBreak;
    }

    public boolean hasSound() {
        return sound;
    } 

    public void setSound(boolean sound){
        this.sound = sound;
    }

    public boolean hasEngine() {
        return engine;
    } 

    public void setEngine(boolean engine){
        this.engine = engine;
    }

    public boolean hasContainer() {
        return container;
    }

    public void setContainer(boolean container) {
        this.container = container;
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


    public void getTruckInformation() {
        System.out.println("Model of Truck: " + this.getModel() );
        System.out.println("Make of Truck: " + this.getMake() );
        System.out.println("Number of wheels in Truck: " + this.getNumberOfWheels() );
        System.out.println("Top Speed of Truck: " + this.getTopSpeed() );
        System.out.println("Does this Truck have an A/C? : " + this.hasAirCon() );
        System.out.println("Does the Truck Have a HandBreak?: " + this.hasHandBreak() );
        System.out.println("Does this Truck have sound?: " + this.hasSound() );
        System.out.println("Does this Truck have an engine?: " + this.hasEngine() );
        System.out.println("Does this Truck have a container?: " + this.hasContainer() );
        System.out.println("Does this Truck have a Break?: " + this.hasBreak() );
        System.out.println("Is this Truck accelerating?: " + this.hasAcclerate() );
    }
}