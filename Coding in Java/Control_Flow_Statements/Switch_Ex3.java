import java.util.*;

class SwitchCaseDemo {
    public static void main(String args[]) {
        int no;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a single digit number:");
        no = sc.nextInt();
        switch (no) {
            case 1:
                System.out.println("You have entered ONE");
                break;
            case 2:
                System.out.println("You have entered TWO");
                break;
            case 3:
                System.out.println("You have entered THREE");
                break;
            case 4:
                System.out.println("You have entered FOUR");
                break;
            case 5:
                System.out.println("You have entered FIVE");
                break;
            case 6:
                System.out.println("You have entered SIX");
                break;
            case 7:
                System.out.println("You have entered SEVEN");
                break;
            case 8:
                System.out.println("You have entered EIGHT");
                break;
            case 9:
                System.out.println("You have entered NINE");
                break;
            default:
                System.out.println("Invalid Number");
        }
    }
}
