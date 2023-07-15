import models.Pants;
import models.Shirt;

public class Inheritance {
    public static void main(String[] args) {
        Shirt shirt = new Shirt(Shirt.Size.SMALL, 500.0, "Red", "Gocco");
        Pants pants = new Pants(31, 1300.0, "Grey", "Gemmi");
        Pants pants1 = new Pants(32, 1500.0, "Grey", "Gemmi");

        System.out.println(pants1.compareTo(pants));

        pants.fold();
        pants.discount();

        // accessing inherited getterr method
        Shirt shirt1 = new Shirt(shirt);

        System.out.println(shirt.getBrand());

        System.out.println(shirt.equals(shirt1));
        System.out.println(shirt);
    }
}
