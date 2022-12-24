package JavaPractice.rand;

import java.util.HashSet;
import java.util.Set;

public class Bench {
    long factorial(int num){
        long ii=1;
        for(int i =2 ; i <=  num ; i++) {
            ii *= i;
        }
        return ii;
    }
    public static void main(String[] args) {
        Bench ob = new Bench();
        final long start = System.currentTimeMillis();

        //List<Integer> set = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for(int i = 0 ; i < 60650 ; i++)
            set.add(i);


        for(int i =0 ; i < 70400 ; i++){
            for(int j =0 ; ++j < 5 ; )
                set.contains(i);
        }
        final long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
