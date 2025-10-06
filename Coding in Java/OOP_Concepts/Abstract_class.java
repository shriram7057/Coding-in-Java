//Creating an abstract class having abstract method  
abstract class Bike {
    abstract void run();
}

// Creating a child class and override abstract method
class Honda extends Bike {
    void run() {
        System.out.println("running safely");
    }
}

// Creating a Main class to create object and call methods
class Abstract_class {
    public static void main(String args[]) {
        Bike obj = new Honda();
        obj.run();
    }
}