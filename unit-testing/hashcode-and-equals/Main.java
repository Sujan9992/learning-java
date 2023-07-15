public class Main {
    public static void main(String[] args) {
        Car nissan = new Car("Nissan", 2005);
        System.out.println("Nissan " + nissan.hashCode());

        Car toyota = new Car("Toyota", 2001);
        System.out.println("toyota " + toyota.hashCode());

        Car toyota1 = new Car(toyota);
        System.out.println("toyata1 " + toyota1.hashCode());

        }
}
