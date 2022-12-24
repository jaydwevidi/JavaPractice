package JavaPractice.rand;

import java.util.*;

public class Random01 {
    public static void main(String[] args) {

        String[] namesArr = {
                "Jay" , "Dwivedi" , "Raj" ,
                "Dwivedi" , "Manoj" ,
                "Bruce" , "Jenner" , "Jenner"};

        List<String> list = new ArrayList<String>();
        //Arrays.stream(namesArr).toList();
        list.stream().toArray();

        Set<String> set = new HashSet<String>(list);
        Iterator iterator =  set.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
