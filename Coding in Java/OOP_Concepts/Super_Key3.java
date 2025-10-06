class Animal {
    Animal() {
        System.out.println("animal is created");
    }
}

class Dog extends Animal {
    Dog() {
        super(); // calls the constructor of parent class
        System.out.println("dog is created");
    }
}

class Super_Key3 {
    public static void main(String args[]) {
        Dog d = new Dog();
    }
}