public class Arrays {
   public static void main(String[] args) {
    String[] names = {"Ram", "Shyam", "Hari"};
    String[] pets = new String[4]; // declare array of length 4

    System.out.println(pets.length);
    String array = names.toString();

    System.out.println(array);
    System.out.println("The length of the array is " + names.length);
    System.out.println(names); // prints reference to aray   
    System.out.println(names[0]);

    names[0] = "Sita";
    System.out.println(names[0]);

    for (int i = 0; i < names.length; i++){
      pets[i] = names[i];
      System.out.println("The curent index is "  +  i + " and element is " + names[i]);
    }
    System.out.println(pets[3]);
    pets[3] = "Sam";
    System.out.println(pets[3]);
   }
}
