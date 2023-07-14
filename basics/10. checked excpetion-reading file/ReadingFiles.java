import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFiles {
    public static void main(String[] args) {
        try{
            FileInputStream f = new FileInputStream("Greetings.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            sc.close();
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
