package Cycle;

import Vehicle.Vehicle;

public class Cycle extends Vehicle {

    public Cycle() {

    }

    public Cycle(String model, String make, int numberOfWheels){
        super(model, make, numberOfWheels, numberOfWheels);
    }

    public void getCycleInformation() {
        System.out.println("Model of Cycle: " + this.getModel() );
        System.out.println("Make of Cycle: " + this.getMake() );
        System.out.println("Number of wheels in Cycle: " + this.getNumberOfWheels() );
    }
}