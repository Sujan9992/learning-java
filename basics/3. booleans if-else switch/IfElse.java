import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks.");
        int result = sc.nextInt();
        if (result < 50) {
            System.out.println("Fail");
        } else if (result > 50 && result < 70) {
            System.out.println("Pass");
        } else {
            System.out.println( "........");
        }
        sc.close();
    }
}
