// Java Interface Example

// First Interface
interface Animal {

    void eat();

    void sleep();

    void sound();
}

// Second Interface
interface Pet {

    void play();

    void friendly();
}

// Class implementing multiple interfaces
class Dog implements Animal, Pet {

    public void eat() {
        System.out.println("Dog is eating food");
    }

    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    public void sound() {
        System.out.println("Dog barks: Woof Woof");
    }

    public void play() {
        System.out.println("Dog is playing with a ball");
    }

    public void friendly() {
        System.out.println("Dog is friendly with humans");
    }
}

// Another class implementing Animal
class Cat implements Animal {

    public void eat() {
        System.out.println("Cat is drinking milk");
    }

    public void sleep() {
        System.out.println("Cat is sleeping");
    }

    public void sound() {
        System.out.println("Cat says: Meow Meow");
    }
}

// Main Class
public class InterfaceDemo {

    public static void main(String[] args) {

        System.out.println("===== JAVA INTERFACE DEMONSTRATION =====");

        // Creating Dog object
        Dog d = new Dog();

        System.out.println("\n--- Dog Details ---");

        d.eat();
        d.sleep();
        d.sound();
        d.play();
        d.friendly();

        // Creating Cat object
        Cat c = new Cat();

        System.out.println("\n--- Cat Details ---");

        c.eat();
        c.sleep();
        c.sound();

        // Interface reference
        Animal a;

        a = d;

        System.out.println("\n--- Interface Reference ---");

        a.sound();
        a.eat();

        a = c;

        a.sound();
        a.sleep();

        System.out.println("\nProgram Completed Successfully!");
    }
}
