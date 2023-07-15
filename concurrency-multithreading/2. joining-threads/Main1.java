import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Main1 {

    static final double TARGET = 0.5;
    static final double PRECISION = 0.000000001;
    static double result = 0;

    public static void main(String[] args) {
        // Runnable interface has void return type
        // Runnable runnable = () -> result = generateNUmber();
        // Thread thread = new Thread(runnable);

        // Callable Interface return value
        Callable<Double> callable = () -> generateNUmber();
        // thread requires runnable, so future task implements runnable
        FutureTask<Double> future = new FutureTask<>(callable);
        Thread thread = new Thread(future);
        thread.start();
        double precision = difference(result);
        try {
            result = future.get();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // Runnable
        // try {
        //     thread.join(); // after thread is complete only tyhen main thread completes
        // } catch (InterruptedException e) {
        //     System.out.println(e.getMessage());
        // }
        System.out.println("The computer returned a value of: " + result);
        System.out.println("The value was generated to a precision of : " + precision);
    }

    public static double generateNUmber() {
        double number = Math.random();
        double difference = difference(number);

        while (difference > PRECISION) {
            number = Math.random();
            difference = difference(number);
        }
        return number;
    }

    public static double difference(double number) {
        return Math.abs(TARGET - number);
    }
}
