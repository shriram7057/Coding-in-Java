//Java program to initialize the values from one object to another object.  
class Student {
    int id;
    String name;

    // constructor to initialize integer and string
    Student(int i, String n) {
        id = i;
        name = n;
    }

    // constructor to initialize another object
    Student(Student s) {
        id = s.id;
        name = s.name;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

class Copy_Cons {
    public static void main(String args[]) {
        Student s1 = new Student(111, "Shriram");
        Student s2 = new Student(s1);
        s1.display();
        s2.display();
    }
}