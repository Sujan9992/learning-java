import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
            {0,0,0,},
            {0,0,0,},
            {0,0,0,},
        };
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j  < matrix[i].length; j++){                 
               matrix[j][i] = i;
            }          
        }

        System.out.println(Arrays.deepToString(matrix));
        
        System.out.println(Arrays.deepToString(matrix)
                         .replace("],","\n").replace(",","\t| ")
                         .replaceAll("[\\[\\]]", " "));
    }
    
}
