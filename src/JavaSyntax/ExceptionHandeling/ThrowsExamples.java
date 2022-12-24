package JavaSyntax.ExceptionHandeling;
import java.io.IOException;
import java.sql.SQLDataException;

public class ThrowsExamples {
    void fun1()throws IOException  {
        System.out.println("fun1");
        throw  new IOException();
    }
    void fun2() throws IOException , SQLDataException {
        //throws IOException must be added to function
        //because fun1() is called
        fun1();
        System.out.println("fun2");

    }
    void fun3(){
        System.out.println("fun3");
        try {
            fun2();
            System.out.println("No Exception Occured");
        }catch (Exception e){
            System.out.println("Exception Caught : " + e.toString());
        }finally {
            System.out.println("Finally Block called");
        }
    }

    public static void main(String[] args) {
        ThrowsExamples obj = new ThrowsExamples();
        obj.fun3();
        System.out.println("Normal Flow");
    }

}
