import java.util.*;
class Student
{
    int rollno;
    String name;
    float marks;
    void get_stud_info()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student rollno");
        rollno=sc.nextInt();
        System.out.println("Enter student name");
        name=sc.next();
        System.out.println("Enter student marks");
        marks=sc.nextFloat();
    }
    void disp_stud_data()
    {
        System.out.println("Rollno="+rollno);
        System.out.println("name="+name);
        System.out.println("marks="+marks);
    }
    public static void main(String args[])
    {
        Student s1=new Student();
        s1.get_stud_info();
        s1.disp_stud_data();
    }
}
