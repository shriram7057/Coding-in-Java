class Student {
    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }

    void show() {
        System.out.println(name + " " + age);
    }
}

class Array_of_Objects {
    public static void main(String[] args) {
        Student[] s = {
            new Student("Amit", 20),
            new Student("Sita", 22),
            new Student("Ravi", 19)
        };

        for (int i = 0; i < s.length; i++)
            s[i].show();
    }
}
