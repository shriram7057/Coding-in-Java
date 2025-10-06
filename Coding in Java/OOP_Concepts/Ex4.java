import java.util.*;

class Employee {
    int empid;
    String name;
    float salary;

    void get_emp_info() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID:");
        empid = sc.nextInt();
        System.out.println("Enter Employee NAME:");
        name = sc.next();
        System.out.println("Enter Employee Salary:");
        salary = sc.nextFloat();
    }

    void disp_emp_info() {
        System.out.println(empid + "\t" + name + "\t" + salary);
    }

    public static void main(String argsp[]) {
        Employee e[] = new Employee[5];
        int i;
        for (i = 0; i < 2; i++) {
            e[i] = new Employee();
            e[i].get_emp_info();
        }
        System.out.println("EMPID\tNAME\tSALARY");
        System.out.println("=====================");
        for (i = 0; i < 5; i++) {
            e[i].disp_emp_info();
        }
    }
}