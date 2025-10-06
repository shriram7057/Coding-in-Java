public class Static_Blank_Final_Variable {
    static final int data;// static blank final variable
    static {
        data = 50;
    }

    public static void main(String args[]) {
        System.out.println(Static_Blank_Final_Variable.data);
    }
}