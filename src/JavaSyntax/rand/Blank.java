package JavaSyntax.rand;

import java.util.*;

public class Blank {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,2,};
        List l = Collections.singletonList(arr);
        Set<Integer> set = new HashSet<Integer>(l);
        List<Integer> ll = new ArrayList<>() ;
        ll.addAll(set);

        ll.forEach(System.out::println);
    }
}
