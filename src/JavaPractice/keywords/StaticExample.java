package JavaPractice.keywords;

public class StaticExample {
    int roll;
    String studentName;

    static String collegeName = "MUJ";
    /*
    All static variables of will have the same values across different objects
    roll and student name will be different for every object
    but college name will be same for all objects of class StaticExample()
    if we change the collegeName variable through 1
     */
    public StaticExample(int roll, String studentName) {
        this.roll = roll;
        this.studentName = studentName;
    }

    void changeCollegeName(String newName){
        collegeName = newName;
    }
    String getCollegeName(){
        return collegeName;
    }
}

class Driver{
    public static void main(String[] args) {
        StaticExample obj1 = new StaticExample(41 , "Jay Dwivedi");
        StaticExample obj2 = new StaticExample(42 , "Samridh Agrawal");

        System.out.println(obj1.getCollegeName());

        StaticExample.collegeName = "VIT";

        System.out.println(StaticExample.collegeName);
        System.out.println(obj1.getCollegeName());
        System.out.println(obj2.getCollegeName());


    }
}
