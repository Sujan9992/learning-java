import java.util.Scanner;

public class RuntimeExceptions2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a anumber");
        if (sc.hasNextInt()) {
            System.out.println(sc.nextInt());
        } else {
            sc.nextLine();
            System.out.println("Not a number");
        }
        sc.close();
    }
}
