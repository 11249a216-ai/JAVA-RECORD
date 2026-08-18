class Vehicle {
    void start() {
        System.out.println("Vehicle starts its journey");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car moves smoothly on the road");
    }
}

class SportsCar extends Car {
    void race() {
        System.out.println("Sports car speeds around the track");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        SportsCar s = new SportsCar();

        s.start();
        s.drive();
        s.race();
    }
}