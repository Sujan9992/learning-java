public class MultiThread {

    // Way -1 
    // static class LongTask implements Runnable {
    //     @Override
    //     public void run() {
    //         longTask();
    //     }
    // }

    public static void main(String[] args) {
        // LongTask runnable = new LongTask();
        // Way - 2
        // Runnable  runnable = new Runnable() {
        //     @Override
        //     public void run() {
        //      longTask();           
        //     }
        // };
        // Thread thread = new Thread(runnable);

        // Way -3 using lambda expresssion for single method
        Thread thread = new Thread(()-> longTask());
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        thread.interrupt();
        System.out.println(thread.isInterrupted());
        System.out.println(thread.getState());
        System.out.println("Doing other work on main thread");
    }

    public static void longTask() {

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Sleeping over");
        
        long t = System.currentTimeMillis();
        long end = t + 3000;
        while (true) {
            if (System.currentTimeMillis() == end) {
                System.out.println("Finished long task");
                break;
            }else if(Thread.currentThread().isInterrupted()){
                System.out.println("Thread Interrupted");
                break;
            }
        }
    }

}
