class Main {
    int data = 50;

    void change(Main obj) {
        obj.data += 100; // modifies instance variable
    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println("Before change: " + obj.data);
        obj.change(obj); // passing object (call by reference)
        System.out.println("After change: " + obj.data);
    }
}
