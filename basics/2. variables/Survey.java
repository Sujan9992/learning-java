import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println("What is your age?");
        int age = scan.nextInt();
        System.out.println("What is your percentage?");
        double percentage = scan.nextDouble();
        scan.close();
        System.out.println("Name: " + name + " " + "Age: " + age + " " + "Percentage: " + percentage);
    }
}
