//Creating two interfaces  
interface Printable {
    void print();
}

interface Showable {
    void show();
}

// Creating a class that implements two interfaces
class Computer implements Printable, Showable {
    public void print() {
        System.out.println("printing data...");
    }

    public void show() {
        System.out.println("showing data...");
    }
}

// Creating a Main class to create object and call methods
class Interface3 {
    public static void main(String args[]) {
        Computer c = new Computer();
        c.print();
        c.show();
    }
}