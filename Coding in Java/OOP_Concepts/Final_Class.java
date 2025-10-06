final class Bike {
}

// We cannot inherit the final class
public class Main extends Bike {
    void run() {
        System.out.println("running safely with 100kmph");
    }

    public static void main(String args[]) {
        Main obj = new Main();
        obj.run();
    }
}

// When we compile the above code, it shows a compile-time error, as follows:

// Main.java:3: error: cannot inherit from final Bike
// public class Main extends Bike
// ^
// 1 error