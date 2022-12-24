package JavaSyntax.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class TSet {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(432);
        list.add(6542);
        list.add(564);
        list.add(123);

        System.out.println(new HashSet<>(list));
        //HashSet maintains no order.
        //TreeSet maintains ascending order.
        System.out.println(new TreeSet<>(list));
    }
}
