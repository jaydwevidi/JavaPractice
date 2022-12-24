package JavaPractice.rand;

import java.util.Scanner;

public class Compress {
    void isPrime(){

    }
    public static String compressString(String s)
    {
        String ans="";
        for (int i = 0; i < s.length(); i++) {


            int count = 1;
            while (i + 1 < s.length()
                    && s.charAt(i)
                    == s.charAt(i + 1)) {
                i++;
                count++;
            }


            ans+=s.charAt(i);
            if(count!=1)
                ans+=count;
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "aaabCssdew";
        System.out.println(compressString(s));
    }
}
