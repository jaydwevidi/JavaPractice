package JavaPractice.rand;

interface one{
    void xx();
}
interface two{
    void xx1();
}
interface three extends one , two {
}

public class InterfaceDemo implements three {
    @Override
    public void xx() {

    }

    @Override
    public void xx1() {

    }

}

