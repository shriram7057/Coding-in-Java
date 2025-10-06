//The super keyword in Java is a reference variable that is used to refer to immediate parent class objects.
//Java Program to illustrate the use of super keyword
//Creating parent class
class Animal {
    String color = "white";
}

// Creating child class
class Dog extends Animal
{
    String color = "black";

    void printColor() {
        System.out.println(color);// prints color of Dog class
        System.out.println(super.color);// prints color of Animal class
    }
}

// Creating Main class to create object and call methods
class Super_Key {
    public static void main(String args[]) {
        Dog d = new Dog();
        d.printColor();
    }
}