import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class flterMap {

    public static void main(String[] args) {
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        Scanner src = new Scanner(System.in);
        System.out.print("How many number you want to enter?");
        int n = src.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter a number");
            listOfNumbers.add(src.nextInt());
        }

        List<Integer> Listodddata = listOfNumbers.stream().filter((item) -> {
            if (item % 2 != 0) {
                return true;
            }
            return false;
        }).collect(Collectors.toList());
        System.out.println("Collection of odd numbers"+Listodddata);


        List<Integer> Listevendata = listOfNumbers.stream().map((item) -> {
            return item * item * item;
        }).collect(Collectors.toList());
        System.out.println("Collection of Cubic Numbers :- " + Listevendata);
    }
}