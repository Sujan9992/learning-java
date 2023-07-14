import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFilesTwo {

    public static void loadData(String name)throws FileNotFoundException{
        FileInputStream f = new FileInputStream(name);
        Scanner sc = new Scanner(f);
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
    public static void main(String[] args) {
      try{
        loadData("Greetings.txt");
      }catch (FileNotFoundException e){
        System.out.println(e.getMessage());
      }
    }
}
