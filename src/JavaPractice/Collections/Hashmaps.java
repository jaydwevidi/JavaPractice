package JavaPractice.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmaps {
    public static void main(String[] args) {

        Map<String , Double >  animals = new HashMap<>();

        animals.put("Dog" , 4.0);
        animals.put("Peacock" , 2.0);
        animals.put("octopus" , 8.0);



        System.out.println(animals.containsKey("Dog"));

        System.out.println(animals.containsValue("Random Batman"));
        System.out.println(animals.containsValue(4.0));

        System.out.println(animals.get("Dog"));
        System.out.println(animals.get("Fish"));

        Set<String> animalNamesSet = animals.keySet();
        //List<Double> animalValues = animals.values().stream().toList();

        System.out.println(animals.keySet());
        //System.out.println(animalValues);
        System.out.println(animals);






    }
}
