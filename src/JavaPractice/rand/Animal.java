package JavaPractice.rand;

import java.util.Objects;

public class Animal {
    String title;
    int weight;
    int legs;

    public Animal(String title, int weight, int legs) {
        this.title = title;
        this.weight = weight;
        this.legs = legs;
    }


    public String toString(){
        String r = "[";
        r+=title;
        r+=" , ";
        r+=weight;
        r+=" , ";
        r+=legs;
        r+="]";
        return r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return weight == animal.weight && legs == animal.legs && Objects.equals(title, animal.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, weight, legs);
    }
}
