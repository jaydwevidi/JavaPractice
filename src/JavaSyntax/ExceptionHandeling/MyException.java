package JavaSyntax.ExceptionHandeling;

public class MyException extends Exception{
    MyException(){
        System.out.println("MyException Instantiated !");
    }
}
class Driver{
    static void m() throws MyException{
        throw new MyException();
    }
    public static void main(String[] args) {
        try {
            m();
        }catch (MyException me){
            System.out.println("MyException() caught");
        }
    }
}
