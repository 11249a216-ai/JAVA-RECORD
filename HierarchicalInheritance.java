class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving on the highway");
    }
}
class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike is riding on the road");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {

        Car c = new Car();
        c.start();
        c.drive();

        Bike b = new Bike();
        b.start();
        b.ride();
    }
}