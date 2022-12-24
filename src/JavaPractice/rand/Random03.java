package JavaPractice.rand;

import java.net.http.HttpConnectTimeoutException;

enum Colours{
    RED,
    BLUE,
    GREEN,
    BLACK;


}
class Random03{

    int Random03(){
        System.out.println("constructor");
        return 0;
    }
    public static void main(String[] args) throws HttpConnectTimeoutException {
        Colours a = Colours.BLACK;
        System.out.println(Colours.values());

        if(5 % 2 == 1);
            //throw new HttpConnectTimeoutException("Bad Weather");
        try{
            Exception e =  new ArrayIndexOutOfBoundsException("aaja aaja");
            throw e;

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage() + " AIOBException caught : "+e);
        }catch (Exception e){
            System.out.println("Exception Caught " + e);
        }finally {
            System.out.println("Finally Called");
        }

    }
}