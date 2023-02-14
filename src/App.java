import Car.Car;
//import Bike.Bike;
import Truck.Truck;
//import Cycle.Cycle;

public class App {
   public static void main(String[]args) throws Exception {
    Car SEDAN = new Car("Essentra", "Honda", 4, 105, true, true, false, true,true,true );

    Truck HATCHBACK = new Truck("4x4 Uprising", "Toyota", 6 , 100, true, true, true,true,false, false, true);

    SEDAN.getCarInformation();

    HATCHBACK.getTruckInformation();

   }
}
