package JavaPractice.Collections;

import java.util.*;

public class Iterator1 {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee(7533 , "Phoebe Buffay" , 673553));
        list.add(new Employee(342 , "Ross Geller" , 43254));
        list.add(new Employee(753 , "Monica Geller" , 57643));
        list.add(new Employee(354 , "Chandler Bing" , 654543));
        list.add(new Employee(433 , "Joey Tribbiani" , 5634));

        Set<Employee> empSetTree = new TreeSet<Employee>(list);


        System.out.print("With Special Loop : ");
        for(Employee e : empSetTree)
            System.out.print(e + " , ");
        System.out.println();


        Iterator<Employee> iterator = empSetTree.iterator();

        System.out.print("With Iterator : ");
        while (iterator.hasNext())
            System.out.print(iterator.next() + " , ");
    }
}
