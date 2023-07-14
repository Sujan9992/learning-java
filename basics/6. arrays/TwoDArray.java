import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] grades = {
            {1,2,3},
            {4,5,6},
        };
        System.out.println(grades[0][1]);

        for(int i = 0; i < grades.length; i++){
            switch(i){
                case  0: System.out.println("Ram ");  break;
                case  1: System.out.println("Sam ");  break;
                default: System.out.println("Eror");
            }
            for(int j = 0;  j  < grades[i].length; j++){
                System.out.println(grades[i][j]);
            }
        }

        int[][] numbers = new int[2][2]; // array with 2 rows 2 columns
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[1][0] = 3;
        numbers[1][1] = 4;
        System.out.println(Arrays.toString(numbers[0]));
        System.out.println(Arrays.toString(numbers[1]));
    }
    
}
