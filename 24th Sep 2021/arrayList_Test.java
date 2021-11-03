import java.util.Scanner;
import java.util.ArrayList;

public class arrayList_Test {

        public static void main(String[] args) {

            ArrayList<Integer> numList = new ArrayList<Integer>();

            Scanner sc = new Scanner(System.in);

            System.out.println("How many numbers you want to enter : ");
            int range = sc.nextInt();

            System.out.println("Enter the elements of the arrayList: ");
            for (int i = 0; i < range; i++) {
                int num = sc.nextInt();
                numList.add(num);
            }

            System.out.println("even data in arrayList : ");
            for (int i = 0; i < numList.size(); i++) {
                if ((numList.get(i)) % 2 == 0) {
                    System.out.println(numList.get(i));
                }
            }
        }
}
