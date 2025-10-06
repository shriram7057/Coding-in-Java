enum Color {
    RED,
    GREEN,
    BLUE;
}
public class Non_PrimitiveDataTypes {
    public static void main(String[] args) {
        String str = "Hello";
        int[] arr = { 1, 2, 3, 4, 5 };
        Color clr = Color.BLUE;
        System.out.println(clr);
        System.out.println(str);
        for (int member: arr) {
        System.out.print(member+", ");
        }
    }
}