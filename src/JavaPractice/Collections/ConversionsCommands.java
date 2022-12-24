package JavaPractice.Collections;

import java.util.*;

public class ConversionsCommands {
    public static void main(String[] args) {

        String[] namesArr = {"Jay" , "Dwivedi" , "Raj" , "Dwivedi" , "Manoj" ,
                "Bruce" , "Jenner" , "Jenner"};

        List<String> namesList = new ArrayList<>();

        namesList.addAll(Arrays.asList(namesArr));
        System.out.println(namesList);

        namesList = Arrays.asList(namesArr);
        System.out.println(namesList);

        //Set<String> nameSet1 = new HashSet<>(Arrays.stream(namesArr).toList());
        Set<String> nameSet2 = new HashSet<String>(namesList);
        Set<String> nameSet3 = new HashSet<String>(Arrays.asList(namesArr));
        //System.out.println(nameSet1);

        Integer[] arr = {523,52,34,52,452,345,2,463,5,645786,46};
        // int[] arr = {523,52,34,52,452,345,2,463,5,645786,46};
        // this statement won't work because arraylist cannot have primitive type
        // like int , double etc. it should Only have a Wrapper Class of int
        // ie. Integer()
        Arrays.sort(arr);

        System.out.println(Arrays.asList(arr));
    }
}
