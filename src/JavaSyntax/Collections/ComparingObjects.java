package JavaSyntax.Collections;

import java.util.*;

final class Employee implements Comparable<Employee> {
    int id;
    String name;

    public Employee(int id, String name, int data) {
        this.id = id;
        this.name = name;
    }


    public String toString() {
        return id + ":" + name;
    }

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }
}


public class ComparingObjects {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(7533, "Phoebe Buffay", 673553));
        list.add(new Employee(342, "Ross Geller", 43254));
        list.add(new Employee(753, "Monica Geller", 57643));
        list.add(new Employee(354, "Chandler Bing", 654543));
        list.add(new Employee(433, "Joey Tribbiani", 5634));


        Comparator<Employee> myComparator2 = Comparator.comparingInt(o -> o.id);
        Comparator<Employee> myComparator3 = (o1, o2) -> o1.id - o2.id;


        Comparator<Employee> myComparator4 = new Comparator<>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.id - o2.id;
            }
        };


        System.out.println(list);

        Collections.sort(list, myComparator4);
        list.sort(myComparator4);


        System.out.println(list);
        Collections.sort(list);
        //uses default comparator from Employee.compareTo() ie. alphabetically
        System.out.println(list);

        Integer[] arr = {523, 52, 34, 52, 452, 345, 2, 463, 5, 645786, 46};
        // int[] arr = {523,52,34,52,452,345,2,463,5,645786,46};
        // this statement won't work because arraylist cannot have primitive type
        // like int , double etc. it should Only have a Wrapper Class of int
        // ie. Integer()
        Arrays.sort(arr);

        System.out.println(Arrays.asList(arr));
    }
}
