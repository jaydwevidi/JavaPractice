package JavaPractice.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringPalindrome {
    void itrs(String s){
        if (s.length() == 2)
        {
            System.out.println(s.charAt(0)+s.charAt(1));
            System.out.println(s.charAt(1)+s.charAt(0));
        }
    }

    static Map<Character , Integer> occurances (List<Character> charList){
        Map<Character , Integer> map = new HashMap<>();

        for(int i = 0 ; i < charList.size() ; i++){
            char c = charList.get(i);
            map.put(c , map.containsKey(c) ? map.get(c)+ 1 : 1);
        }
        return  map;
    }
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        String s = "Bruce Wayne";
        for(int i = s.length() - 1 ; i >=0  ; i--)
            sb.append(s.charAt(i));

        System.out.println(sb);

        List<Character> charlist = new ArrayList<>();

        for(int i = 0  ; i  < s.length() ; i++)
            charlist.add(s.charAt(i));

        System.out.println(occurances(charlist));


    }
}
