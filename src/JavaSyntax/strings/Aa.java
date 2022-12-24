package JavaSyntax.strings;

import java.io.IOException;

public class Aa {
    public static void main(String[] args) throws IOException {
        String s1 = "jay";
        String s2 = "jaya";
        s2 = s1.substring(0,3);

        System.out.println(s1 == s2);
        System.out.println(s2);
        Runtime.getRuntime().exec("notepad");
    }
}
