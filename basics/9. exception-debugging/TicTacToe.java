import java.util.Arrays;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] matrix = new char[][]{
            {'_', '_', '_'},
            {'_', '_', '_'},
            {'_', '_', '_'},
        };
        for(int i = 0; i < matrix.length; i++){
         matrix[2-i][2-i] = 'X';
         matrix[i][2-i] = '0';
        }

        System.out.println(Arrays.deepToString(matrix));
        
        System.out.println(Arrays.deepToString(matrix)
                         .replace("],","\n").replace(",","\t| ")
                         .replaceAll("[\\[\\]]", " "));
    }
}
