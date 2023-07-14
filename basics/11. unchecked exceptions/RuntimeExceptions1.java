public class RuntimeExceptions1 {
    public static void main(String[] args) {
        String word = null;
        // word.toUpperCase(); // causse nNullPointerException

        // fix
        if (word == null) {
            System.out.println("Null");
        } else {
            word.toUpperCase();
        }

    }
}
