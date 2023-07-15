package models;

public class Pants extends Product implements Discountable, Comparable<Pants> {
    private int waist;

    public Pants(int waist, double price, String color, String brand) {
        super(price, color, brand);
        this.waist = waist;
    }

    public int getWaist() {
        return this.waist;
    }

    public void setWaist(int waist) {
        this.waist = waist;
    }

    @Override
    public void fold() {
        System.out.println("Pants Folded");

    }

    @Override
    public void discount() {
        System.out.println("No Discount");
    }

    @Override
    public int compareTo(Pants specifiedObject) { // receives an specified object
        String className = this.getClass().getSimpleName();
        String specifiedClassName = specifiedObject.getClass().getSimpleName();

        if (!(className.equals(specifiedClassName))) {
            return className.compareTo(specifiedClassName);
        }
        return (int) Math.round(super.getPrice() - specifiedObject.getPrice());
    }

}
