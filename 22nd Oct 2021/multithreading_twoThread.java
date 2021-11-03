
import java.time.Duration;
import java.time.Instant;



public class multithreading_twoThread {
    public static void main(String[] args) {
        main_Thread t2 = new main_Thread(1, 25000);
        main_Thread t3 = new main_Thread(25001, 50000);

        Instant start = Instant.now();
        t2.start();
        t3.start();

        try {
            t2.join();
            t3.join();
        } catch (Exception e) {
            System.out.println("error");
        }
        System.out.println(main_Thread.getPrimes());
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        System.out.println("Time taken by two threads: " + timeElapsed.toMillis() + " ms");
    }

}