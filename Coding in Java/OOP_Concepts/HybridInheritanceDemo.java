//Hybrid Inheritance Program
import java.util.*;
class Student
{
    int rollno;
    String name;
    void get_stud_info()
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Student rollno");
     rollno=sc.nextInt();
     System.out.println("Enter student name");
     name=sc.next();   
    }
    void disp_stud_info()
    {
        System.out.println("RollNo="+rollno);
        System.out.println("Name="+name);
    }
}
class Test extends Student
{
    int marks1,marks2;
    void get_stud_marks()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student Test-1 Marks");
        marks1=sc.nextInt();
        System.out.println("Enter Student Test-2 Marks");
        marks2=sc.nextInt();
    }
    void disp_stud_marks()
    {
        System.out.println("Test-1 Mrks="+marks1);
        System.out.println("Test-2 Marks="+marks2);
    }
}
class Result extends Test{
    int total;
    void disp_total()
    {
        Scanner sc=new Scanner(System.in);
        total=marks1+marks2;
        System.out.println("Total Marks="+total);
    }
}
class Sports extends Student{
    int Sp_wt;
    void get_sp_wt()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student Sport_Weightage");
        Sp_wt=sc.nextInt();
    }
    void disp_Sp_wt()
    {
        System.out.println("Student Sport_weightage="+Sp_wt);
    }
}
class HybridInheritanceDemo
{
    public static void main(String args[])
    {
        Result r1=new Result();
        Sports s1=new Sports();
        System.out.println("***Student Result class***");

        r1.get_stud_info();
        r1.get_stud_marks();
        r1.disp_stud_info();
        r1.disp_stud_marks();
        System.out.println("*** Student Sport class***");
        
        s1.get_stud_info();
        s1.get_sp_wt();
        s1.disp_stud_info();
        s1.disp_Sp_wt();
    }
}