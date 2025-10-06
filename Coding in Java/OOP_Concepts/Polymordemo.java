class Animal {
    // Method Overloading (compile-time polymorphism)
    void sound() {
        System.out.println("An animal makes a sound");
    }

    void sound(String type) {
        System.out.println("Animal sound: " + type);
    }
}

class Dog extends Animal {
    // Method Overriding (runtime polymorphism)
    @Override
    void sound(String type) {
        System.out.println("Dog barking is: " + type);
    }
}

public class Polymordemo {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        Animal poly = new Dog();
        // Method Overloading
        a.sound();
        a.sound("Generic");
        // Method Overriding
        d.sound("Loud");
        // Performing the Polymorphism
        poly.sound("Soft");
    }
}
