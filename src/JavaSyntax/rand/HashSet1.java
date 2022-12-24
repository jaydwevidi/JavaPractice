package JavaSyntax.rand;

import java.math.BigDecimal;
import java.util.*;
public class HashSet1 {
    public static void main(String[] args) {
        Map<Integer , Integer> set = new HashMap<Integer , Integer>();
        set.put(6 , 60);
        set.put(16 , 160);
        set.put(26 , 260);
        set.put(678 , 6780);
        set.put(65 , 650);
        Integer.toBinaryString(423452345);
        List<Integer> values = new ArrayList<Integer>(set.values());
        List<Integer> keys = new ArrayList<Integer>(set.keySet());
        BigDecimal bd = new BigDecimal("6.321345245e+134");
        //System.out.println(bi);
        //Double.valueOf();
        System.out.println();
        List<Integer> sortedValues = new ArrayList<>(values);

        Collections.sort(sortedValues);

        int largest = sortedValues.get(sortedValues.size() - 1);
        List<Integer> largestOccurrence = new ArrayList<Integer>();
        //System.out.println(largest);

        for (int i = 0 ; i < set.size() ; i++){
            int valueCount = set.get(keys.get(i));
            if (valueCount == largest)
                largestOccurrence.add(keys.get(i));
        }

        for(Integer i : largestOccurrence){
            //System.out.println(i);

        }
    }
}
