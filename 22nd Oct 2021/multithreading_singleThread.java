

import java.time.Duration;
import java.time.Instant;

public class multithreading_singleThread {



    public static void main(String[] args) {
        main_Thread t1 = new main_Thread(1, 50000);
        Instant start = Instant.now();
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println("error");
        }
        System.out.println(main_Thread.getPrimes());
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        System.out.println("Time taken by single thread: " + timeElapsed.toMillis() + " ms");
    }
}

