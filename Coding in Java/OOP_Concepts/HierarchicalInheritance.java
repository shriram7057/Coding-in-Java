import java.util.*;
class Student
{
    int rollno;
    String name;
    void get_stud_info()
    {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter student name");
        name=sc.next();
        System.out.println("Enter Student rollno");
        rollno=sc.nextInt();
    }
    void disp_stud_info()
    {
        System.out.println("Name="+name);
        System.out.println("RollNo="+rollno);
    }
}
class Test extends Student
{
    int marks1,marks2;
    Scanner sc =new Scanner(System.in);
    void get_stud_marks()
    {
        System.err.println("Enter student Test-1 Marks");
        marks1=sc.nextInt();
        System.out.println("Enter Student Test-2 marks");
        marks2=sc.nextInt();
    }
    void disp_stud_marks()
    {
        System.out.println("Test-1 Marks="+marks1);
        System.out.println("Test-2 Marks="+marks2);
    }
}
class Sports extends Student
{
    int sport_wt;
    void get_sport_wt()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Sport Weightage");
        sport_wt=sc.nextInt();
    }
    void disp_sport_wt()
    {
        System.out.println("Sport Weightage="+sport_wt);
    }
}
class HierarchicalInheritanceDemo
{
    public static void main(String[] args) 
    {
        Test t1=new Test();
        Sports s1=new Sports();
        System.out.println("***Test class Implimentation***");  
        t1.get_stud_info();
        t1.get_stud_marks();
        t1.disp_stud_info();
        t1.disp_stud_marks();
        System.out.println("***Sport Class Implimentation***");  
        s1.get_stud_info();
        s1.get_sport_wt();
        s1.disp_stud_info();
        s1.disp_sport_wt();
    }
}