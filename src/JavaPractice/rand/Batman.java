package JavaPractice.rand;// Java program to illustrate the
// concept of inheritance

// base class
class Bicycle {
    // the rand.Bicycle class has rand.two fields
    public int gear;
    public int speed;

    // the rand.Bicycle class has rand.one constructor
    public Bicycle(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }

    // the rand.Bicycle class has rand.three methods
    public void applyBrake(int decrement)
    {
        speed -= decrement;
    }

    public void speedUp(int increment)
    {
        speed += increment;
    }

    // toString() method to print info of rand.Bicycle
    public String toString()
    {
        return ("No of gears are " + gear + "\n"
                + "speed of bicycle is " + speed);
    }
}

// derived class
class MountainBike extends Bicycle {

    // the rand.MountainBike subclass adds rand.one more field
    public int seatHeight;

    // the rand.MountainBike subclass has rand.one constructor
    public MountainBike(int gear, int speed,
                        int startHeight)
    {
        // invoking base-class(rand.Bicycle) constructor
        super(gear, speed);
        seatHeight = startHeight;
    }

    // the rand.MountainBike subclass adds rand.one more method
    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }

    // overriding toString() method
    // of rand.Bicycle to print more info
    @Override public String toString()
    {
        return (super.toString() + "\nseat height is "
                + seatHeight);
    }
}

// driver class
public class Batman {
    public static void main(String args[])
    {

        MountainBike mb = new MountainBike(3, 100, 25);
        Bicycle m = new MountainBike(5,5,43);
        System.out.println(m.toString());
    }
}
