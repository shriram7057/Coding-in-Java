class Bike {
    final void run() { // final method
        System.out.println("running");
    }
}

public class Main extends Bike {
    // We cannot override the final method
    void run() {
        System.out.println("running safely with 100kmph");
    }

    public static void main(String args[]) {
        Main obj = new Main();
        obj.run();
    }
}
// When we compile the above code, it shows a compile-time error, as follows:

// Main.java:7: error: run() in Main cannot override run() in Bike
// void run(){System.out.println("running safely with 100kmph");
// ^
// overridden method is final
// 1 error