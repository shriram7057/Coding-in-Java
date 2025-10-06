import java.util.*;

class staticDemo {
    int no;
    static int count;

    void get_data(int x) {
        no = x;
        count++;
    }

    void disp_no() {
        System.out.println("Value of no=" + no);
    }

    static void disp_count() {
        System.out.println("Value o a count=" + count);
    }

    public static void main(String args[]) {
        staticDemo s1 = new staticDemo();
        staticDemo s2 = new staticDemo();
        staticDemo s3 = new staticDemo();
        s1.get_data(100);
        s1.get_data(200);
        s1.get_data(300);
        System.out.println("Objects of s1");
        s1.disp_no();
        staticDemo.disp_count();
        System.out.println("***Object s2***");
        s2.disp_no();
        staticDemo.disp_count();
        System.out.println("***Object s3***");
        s3.disp_no();
        staticDemo.disp_count();
    }

}
