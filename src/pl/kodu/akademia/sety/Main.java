package pl.kodu.akademia.sety;

import pl.kodu.akademia.listy.Car;
import pl.kodu.akademia.listy.Pet;

public class Main {
    public static void main(String[] args) {
        Car a = new Car("BMW", 1999);
        Car b = new Car("BMW", 1999);

        System.out.println(a);
        System.out.println(b);
        System.out.println(a.equals(b));

        System.currentTimeMillis();
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}
