class Dynamic_Binding {
    void eat() {
        System.out.println("animal is eating...");
    }
}

class Dog extends Dynamic_Binding {
    void eat() {
        System.out.println("dog is eating...");
    }

    public static void main(String args[]) {
        Dynamic_Binding a = new Dog(); // upcasting
        a.eat(); // dynamic binding in action
    }
}
// Output: dog is eating...