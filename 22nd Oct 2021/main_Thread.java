import java.util.ArrayList;



public class main_Thread extends Thread {
    private int start, end;
    private static ArrayList<Integer> primeNumbers = new ArrayList<>();

    public main_Thread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public static ArrayList<Integer> getPrimes() {
        return main_Thread.primeNumbers;
    }

    public void run() {

        for (int i = this.start; i <= this.end; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                this.primeNumbers.add(i);
            }
        }

    }
}
