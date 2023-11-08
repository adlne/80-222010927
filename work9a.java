// Define an interface for vehicles
interface Vehicle {
    void start();
}

// Create a Car class that implements the Vehicle interface
class Car implements Vehicle {
    public void start() {
        System.out.println("Car started");
    }
}

// Create a Bicycle class that implements the Vehicle interface
class Bicycle implements Vehicle {
    public void start() {
        System.out.println("Bicycle started");
    }
}

// Create a Boat class that implements the Vehicle interface
class Boat implements Vehicle {
    public void start() {
        System.out.println("Boat started");
    }
}

// Create a Driver class to test the vehicles
public class Driver {
    public static void main(String[]args) {
        // Create objects of different vehicles
        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();
        Vehicle boat = new Boat();

        // Call the start method for each vehicle
        car.start();
        bicycle.start();
        boat.start();
    }
}
// OUT PUT:
PS C:\Users\USER> Car started
>> Bicycle started
>> Boat started
