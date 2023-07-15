package models;

import java.util.Objects;

public class Shirt extends Product {
    public enum Size {
        SMALL, MEDIUM, LARGE
    }

    private Size size;

    public Shirt(Size size, double price, String color, String brand) {
        super(price, color, brand);
        this.size = size;
    }

    public Shirt(Shirt source) {
        super(source);
        this.size = source.size;
    }

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Shirt)) {
            return false;
        }
        Shirt shirt = (Shirt) o;
        return size.equals(shirt.size) && super.getPrice() == shirt.getPrice()
                && super.getBrand().equals(shirt.getBrand()) && super.getColor().equals(shirt.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, super.getPrice(), super.getBrand(), super.getColor());
    }

    @Override
    public String toString() {
        return "{" +
                "\n" +
                " size='" + getSize() + "'" +
                "\n" +
                " brand'" + super.getBrand() + "'" +
                "\n" +
                " price'" + super.getPrice() + "'" +
                "\n" +
                " color'" + super.getColor() + "'" +
                "\n" +
                "}";
    }

    @Override
    public void fold() {
       System.out.println("Shirts Folded");
        
    }

}
