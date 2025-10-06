//Creating an interface  
interface Printable {
    void print();
}

// Creating a class that implements Printable
class Printer implements Printable {
    public void print() {
        System.out.println("Hello Shriram");
    }
}

// Creating a class that creates objects and call methods
class Interface {
    public static void main(String args[]) {
        Printable p = new Printer();
        p.print();
    }
}