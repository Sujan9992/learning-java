public class Loops {
    public static void main(String[] args) {
        int num = 5;
        while(num != 0){
            System.out.println(
                "Not 0"
            );
            num = (int)(Math.random() * 5);
        }

        for (int i = 0; i <=5; i++){
            System.out.println(i);
        }
    }
}
