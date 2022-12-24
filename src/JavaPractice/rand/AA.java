package JavaPractice.rand;

import java.util.ArrayList;
import java.util.List;

public class AA {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(6);
        list.add(16);
        list.add(66);
        list.add(61);
        list.add(61);



        List<Integer> listUnique = new ArrayList<Integer>();

        for(int i =0 ; i <list.size();i++){
            if(!listUnique.contains(list.get(i)))
                listUnique.add(list.get(i));
        }

        System.out.println(listUnique);
    }
}
