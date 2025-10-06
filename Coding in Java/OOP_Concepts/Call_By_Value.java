class Call_By_Value {
    int data = 50;

    void change(int data) {
        data = data + 100; // changes local copy only
    }

    public static void main(String[] args) {
        Call_By_Value obj = new Call_By_Value();
        System.out.println("Before change: " + obj.data);
        obj.change(500);
        System.out.println("After change: " + obj.data);
    }
}
// Output:
// Before change: 50        