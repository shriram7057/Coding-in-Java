class A {
    private A() {
    }// private constructor

    void msg() {
        System.out.println("Hello java");
    }
}

public class Private {
    public static void main(String args[]) {
        A obj = new A();// Compile Time Error
    }
}

// Main.java:7: error: A() has private access in A
// A obj=new A();//Compile Time Error
// ^
// 1 error