import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
         String[] parts = {"Tyres", "engines"};
        Car nissan = new Car("Nissan", 400000.00, 2002, "Blue", parts);
        Car toyota = new Car("Toyota", 20000.00, 2005, "Red", parts);
        //Car toyota2 = new Car(toyota);

        Car[] cars = new Car[] {
            new Car("Nissan", 400000.00, 2002, "Blue", parts),
            new Car("Toyota", 20000.00, 2005, "Red", parts),
            new Car("Honda", 20000.00, 2005, "Red", parts),
        };


        Dealership dealership = new Dealership(cars);

        System.out.println(dealership);

        dealership.sellCar(1);
        System.out.println(dealership);

        System.out.println(nissan);

        // System.out.println(nissan.make);
        // System.out.println(nissan.price);
        // System.out.println(nissan.year);
        // System.out.println(nissan.color);

        // nissan.make = "Nissan";
        // nissan.price = 4000000.00;
        // nissan.year = 2002;
        // nissan.color = "Blue";

        // toyota.make = "Toyota";
        // toyota.price = 124000.00;
        // toyota.year = 2005;
        // toyota.color = "Red";

        toyota.setPrice(toyota.getPrice()/2);
        toyota.setParts(new String[] {"tyres", "brakes"});

        nissan.drive();

        System.out.println(nissan.getMake() + " is worths Rs. " + nissan.getPrice() + ", manufactured in " + nissan.getYear() + ", of color " + nissan.getColor());
        System.out.println(Arrays.toString(nissan.getParts()));

        dealership.sellCar(1);
    }
}
