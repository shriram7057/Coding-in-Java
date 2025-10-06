//Java program to overload constructors  
class Student 
{
    int id;
    String name;
    int age;

    // creating two arg constructor
    Student(int i, String n) {
        id = i;
        name = n;
    }

    // creating three arg constructor
    Student(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    // creating method to display values
    void display() {
        System.out.println(id + " " + name + " " + age);
    }
}

// creating a Main class to create instance and call methods
class Cons_Overloading {
    public static void main(String args[]) {
        Student s1 = new Student(111, "Karan");
        Student s2 = new Student(222, "Aryan", 25);
        s1.display();
        s2.display();
    }
}