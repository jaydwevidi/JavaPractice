package JavaPractice.Collections;

import java.util.*;
import java.util.stream.Collectors;

public class Basics {
    public static void main(String[] args) {

        Integer[] integers = new Integer[] {1,2,3,4,5};
        List<Integer> list21 =  Arrays.asList(integers); // returns a fixed-size list backed by the specified array.
        List<Integer> list22 = new ArrayList<>(Arrays.asList(integers)); // good
        List<Integer> list23 = Arrays.stream(integers).collect(Collectors.toList()); //Java 8 only

        List Intlist = Arrays.asList(integers);

        list22.addAll(Intlist);
        System.out.println(list22);

    }
}
