package JavaPractice.DataStructureImplementation;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class HTSeperateChaining {
    int size;
    List<Integer>[] hashTable;

    HTSeperateChaining(){
        size =10;
        hashTable = new LinkedList[10];

        for(int i = 0 ; i < 10 ; i++)
            hashTable[i] = new LinkedList<Integer>();
    }

    private int findHashCode(int num){
        return (num * 17 + 341) % 10;
    }

    void printHT(){
        System.out.println(Arrays.asList(hashTable));
    }

    void add(int num){
        int hc = findHashCode(num);
        hashTable[hc].add(num);
    }

    int contains(int num){
        int hc = findHashCode(num);
        int containsAt = hashTable[hc].indexOf(num);
        System.out.println("Number at Index = "+containsAt);
        return containsAt;
    }
}
