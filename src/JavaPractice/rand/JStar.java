package JavaPractice.rand;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JStar {
    public static void main(String[] args) {
        List<Animal> set = new ArrayList<>();

        set.add(new Animal("Elephant",100,4));
        set.add(new Animal("Lion",40,4));
        set.add(new Animal("Lion",40,4));
        set.add(new Animal("Sparrow",1,2));

        Set ss = new HashSet<Animal>(set);
        System.out.println(ss);

    }
}
