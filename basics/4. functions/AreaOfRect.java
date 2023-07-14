public class AreaOfRect {
    public static void areaOfRectangle(double length, double breadth){
        if(length< 0 || breadth  < 0){
            System.out.println("Error");
            System.exit(0); // whole program exits
        }
        double area = length * breadth;
        System.out.println("The area of rectangle of length " + length + " and breadth " + breadth +  " is " + area);
    }

    /**
     * 
     * @param length (double)
     * @param breadth (double)
     * @return parameter (double)
     */

    public static double perimeterrOfRectangle(double length, double breadth){
        return 2*(length * breadth);
    }
    public static void main(String[] args) {
        areaOfRectangle(3, 4);
        double perimeter = perimeterrOfRectangle(4, 5);
        System.out.println("The perimeter of rectangle is " + perimeter);

        double sine = Math.sin(2);
        System.out.println(sine);

        double logValue = Math.log(23);
        System.out.println(logValue);

        double power = Math.pow(2, 3);
        System.out.println(power);

        double random = Math.random();
        System.out.println(random);

        double random1 = Math.random() * 5; // get random number upto 0-4
        int random2 = (int)random1;
        System.out.println(random2);

    }
}
