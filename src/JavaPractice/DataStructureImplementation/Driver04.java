package JavaPractice.DataStructureImplementation;

public class Driver04 {
    public static void main(String[] args) {
        HTSeperateChaining ht = new HTSeperateChaining();
        ht.add(423);
        ht.add(42453);
        ht.add(5732);
        ht.add(7635);
        ht.printHT();

        ht.contains(42453);
        ht.contains(432);
    }
}
