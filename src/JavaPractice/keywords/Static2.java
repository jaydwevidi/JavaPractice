package JavaPractice.keywords;
//https://www.javatpoint.com/static-keyword-in-java
public class Static2 {
    int a;
    int b;
    static int c;
    static {
        //static block is called before constructor
        System.out.println("Static block is called");
        c = 432;
    }

    public Static2(int a, int b) {
        System.out.println("Constructor is called");
        this.a = a;
        this.b = b;
    }
    static void incriment(){
        /*
        b++;
        a++;
        */

        //Non-static field 'a' cannot be referenced from a static context
    }

    @Override
    public String toString(){
        return a+" , "+b+" , "+c;
    }
}
class Driver1{
    public static void main(String[] args) {
        System.out.println("Driver");
        new Static2(5 ,5 );
    }
}
