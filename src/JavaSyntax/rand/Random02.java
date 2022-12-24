package JavaSyntax.rand;

import java.util.*;

public class Random02 {
    public static void main(String[] args) {

        String[] namesArr = {
                "Jay" , "Dwivedi", "Dwivedi" , "Ra" ,"R" ,"Raj" ,
                "Dwivretgsedi" , "Manoj" ,"Manoj" ,"Manoj" ,
                "Bruce" , "Jenner" , "Jenner", "Jenner", "Jenner"};

        List<String> list = new ArrayList<String>();

        //list.addAll(Arrays.stream(namesArr).toList());
        System.out.println(list);

        Comparator<String> c = new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }

        };

        Collections.sort(list , c);
        //list.sort(c);

        System.out.println(list);

        Set<String> ts = new TreeSet<>(list);

        System.out.println(ts);
    }
}
