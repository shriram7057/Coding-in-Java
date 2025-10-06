class Main {
    final int SPEED_LIMIT = 90; // final variable

    void run() {
        SPEED_LIMIT = 400; // we cannot change the final variable
    }

    public static void main(String args[]) {
        Main obj = new Main();
        obj.run();
    }
}

// When we compile the above code, it shows a compile-time error, as follows:

// error: cannot assign a value to final variable SPEED_LIMIT