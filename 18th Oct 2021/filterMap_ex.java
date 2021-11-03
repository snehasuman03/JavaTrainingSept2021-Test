

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;



public class filterMap_ex {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(7, 8, 9);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        List<Integer> list3 = Arrays.asList(1, 2, 3);
        List<List<Integer>> Numbers = new ArrayList<>();
        Numbers.add(list1);
        Numbers.add(list2);
        Numbers.add(list3);
        List<Integer> listOfNumbers = Numbers.stream().flatMap(plist -> plist.stream())
                .collect(Collectors.toList());
        System.out.println(listOfNumbers);
    }
}

