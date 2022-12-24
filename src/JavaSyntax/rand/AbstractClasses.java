package JavaSyntax.rand;

abstract class AC{
    void aa(){
        System.out.println('g');
    }
     abstract void  a1();
}
class Temp extends AC{
    void aa(int n){

    }

    void aa(){
        super.aa();
        System.out.println('d');
        super.aa();
    }

    @Override
    void a1() {
        //It is compulsory to implement all methods of abstract class
    }

}
public class AbstractClasses  {
    public static void main(String[] args) {
         Temp assa = new Temp();
         AC obj = new AC() {
             @Override
             void a1() {
             }
         };
         //rand.AC obj = new rand.AC();
         // ^ invalid Statement , Abstract classes cannot be Instantiated
         assa.a1();
         assa.aa();
        }
    }
/*

Interfaces are for when you want to say "I don't care how you do it, but here's what you need to get done."
Abstract classes are for when you want to say "I know what you should do, and I know how you should do it in some/many of the cases."

Abstract class	Interface
1) Abstract class can have abstract and non-abstract methods.	Interface can have only abstract methods. Since Java 8, it can have default and static methods also.
2) Abstract class doesn't support multiple inheritance.	Interface supports multiple inheritance.
3) Abstract class can have final, non-final, static and non-static variables.	Interface has only static and final variables.
4) Abstract class can provide the implementation of interface.	Interface can't provide the implementation of abstract class.
5) The abstract keyword is used to declare abstract class.	The interface keyword is used to declare interface.
6) An abstract class can extend another Java class and implement multiple Java interfaces.	An interface can extend another Java interface only.
7) An abstract class can be extended using keyword "extends".	An interface can be implemented using keyword "implements".
8) A Java abstract class can have class members like private, protected, etc.	Members of a Java interface are public by default.
9)Example:
public abstract class Shape{
public abstract void draw();
}	Example:
public interface Drawable{
void draw();
}

Simply, abstract class achieves partial abstraction (0 to 100%) whereas interface achieves fully abstraction (100%).



 */
