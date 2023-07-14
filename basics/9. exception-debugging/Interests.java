public class Interests {
    public static void main(String[] args) {
        int age = 24;
        double debt = 0;

        String creditScore = debt > 0 ?  "Bad" : "Good";
        boolean canApply = age > 18;

        if (canApply && creditScore.equals("Good")){
            System.out.println("Processing");
        }else{
            System.out.println("Unable to apply");
        }
    }
}
