import java.util.HashMap;

public class KeyValues {
  
    public static void main(String[] args) {
        // String[] vegetables = new String[] {"Cauliflower", "Spaghetti Squash", "Parsley"};
        // double[] prices = new double[] {4.99, 1.99, 6.99};

        HashMap<String, Double> items = new HashMap<String, Double>();
        items.put("item1", 20.0);
        items.put("item2", 40.0);
        System.out.println(items.get("item1"));

        items.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });
    }
  
}
