package JavaSyntax.oops;

public class Overloading {
    void promotion(double a) {
        System.out.println("Type Promotion");
        System.out.println("this = " + this);
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();
        int c = 432;
        obj.promotion(c);
        //Method promotion takes in only a double but when we
        //provide only a int it is automatically promoted to double
        //https://static.javatpoint.com/images/java-type-promotion.png
        //As displayed in the above diagram, the byte can be promoted to short, int, long, float or double.
        // The short datatype can be promoted to int, long, float or double.
        // The char datatype can be promoted to int, long, float or double and so on
    }
}

class OverloadingCalculation3 {
    void sum(int a, long b) {
        System.out.println("a method invoked");
    }

    void sum(long a, int b) {
        System.out.println("b method invoked");
    }

    public static void main(String args[]) {
        OverloadingCalculation3 obj = new OverloadingCalculation3();

        //obj.sum(20,20);//now ambiguity

        /*
        both method sum(int,long) in OverloadingCalculation3
      and method sum(long,int) in OverloadingCalculation3 match

      There are two methods defined with the same name, i.e., sum.
       The first method accepts the integer and long type whereas the second method accepts long and
       the integer type. The parameter passed that are a = 20, b = 20.
        We can not tell that which method will be called as there is no clear differentiation mentioned
        between integer literal and long literal. This is the case of ambiguity.
       Therefore, the compiler will throw an error.
         */

    }
}
