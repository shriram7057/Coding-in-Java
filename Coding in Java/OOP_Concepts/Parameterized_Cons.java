public class Parameterized_Cons {
    int a, b, c;

    Parameterized_Cons(int x, int y) {
        a = x;
        b = y;
    }

    void display() {
        c = a + b;
        System.out.println("Addition=" + c);
    }

    public static void main(String[] args) {
        Parameterized_Cons p1 = new Parameterized_Cons(10, 20);
        p1.display();
    }
}