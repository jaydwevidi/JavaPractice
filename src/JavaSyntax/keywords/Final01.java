package JavaSyntax.keywords;
//How can we create an immutable class in Java?
//We can create an immutable class by defining a final class having all of its members as final.
public class Final01 {
    static final String a ;
    final int x ;
    final int d1;

    static {
        a = "";
    }

    Final01(int d1){
        this.d1 = d1;
        x=5;
    }

    void function(final int xx){
        //xx++;
    }

    public static void main(String[] args) {
        Final01 obj = new Final01(3);
        final int asd;
        asd = 44;


    }
}
