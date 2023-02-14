package Car;

import Vehicle.Vehicle;

public class Car extends Vehicle {
    private boolean airCon, handBreak, sound, engine, accelerate, Break;
    

    public Car(String model, String make, int numberOfWheels, double topSpeed, boolean airCon, boolean handBreak, boolean sound, boolean engine, boolean accelerate, boolean Break ) {
        super(model, make, numberOfWheels, topSpeed);
        this.airCon = airCon;
        this.handBreak = handBreak;
        this.sound = sound;
        this.engine = engine;

    }

    public Car() {

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

    public void getCarInformation() {
        System.out.println("Model of Car: " + this.getModel() );
        System.out.println("Make of Car: " + this.getMake() );
        System.out.println("Number of wheels in car: " + this.getNumberOfWheels() );
        System.out.println("Top Speed of Car: " + this.getTopSpeed() );
        System.out.println("Does this car have an A/C? : " + this.hasAirCon() );
        System.out.println("Does the Car Have a HandBreak?: " + this.hasHandBreak() );
        System.out.println("Does this Car have sound?: " + this.hasSound() );
        System.out.println("Does this car have an engine?: " + this.hasEngine() );
        System.out.println("Does this car have a Break?: " + this.hasBreak() );
        System.out.println("Is this car accelerating?: " + this.hasAcclerate() );
    }


}