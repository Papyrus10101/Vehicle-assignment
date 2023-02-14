package Vehicle;

public class Vehicle {

    private String model;
    private String make;
    private int numberOfWheels;
    private double topSpeed;



    public Vehicle (String model, String make, int numberOfWheels, double topSpeed) {
        this.model = model;
        this.make = make;
        this.numberOfWheels = numberOfWheels;
        this.topSpeed = topSpeed;

    }



    public Vehicle() {
        this.model = "Not Defined / Unknown";
        this.make = "Not Defined / Unknown";
        this.numberOfWheels = 0;
        this.topSpeed = 0;

    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }


    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make){
        this.make = make;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

}