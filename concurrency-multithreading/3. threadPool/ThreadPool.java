import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPool {
    static double[] targets = new double[] { 0.5, 0.8, 0.3 };
    static final double PRECISION = 0.0000001;
    static double result = 0;

    public static void main(String[] args) {
        int processors = Runtime.getRuntime().availableProcessors();
        System.out.println(processors);

        ExecutorService executor = Executors.newFixedThreadPool(processors);
        Future<Double> future1 = executor.submit(() -> generateNumber(0));
        Future<Double> future2 = executor.submit(() -> generateNumber(1));
        Future<Double> future3 = executor.submit(() -> generateNumber(2));
        Future<Double> future4 = executor.submit(() -> generateNumber(1));

        try {
            future1.get();
            future2.get();
            future3.get();
            future4.get();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            executor.shutdown();
        }
        System.out.println("Finished background operations");
    }

    public static double generateNumber(int index) {
        double number = Math.random();
        double difference = difference(number, index);

        while (difference > PRECISION) {
            number = Math.random();
            difference = difference(number, index);
        }
        return number;
    }

    public static double difference(double number, int index) {
        return Math.abs(targets[index] - number);
    }
}
