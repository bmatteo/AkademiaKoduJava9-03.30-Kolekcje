package pl.kodu.akademia.sety;

import pl.kodu.akademia.listy.Car;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Set<Car> set = new TreeSet<>();

        set.add(new Car("BMW", 2000));
        set.add(new Car("BMW", 2000));
        set.add(new Car("BMW", 2001));
        set.add(new Car("BMW", 2002));

        //System.out.println(set);


        /*Set<Integer> integerSet = new TreeSet<>();

        integerSet.add(5);
        integerSet.add(1);
        integerSet.add(8);
        integerSet.add(4);
        integerSet.add(33);
        integerSet.add(90);

        System.out.println(integerSet);*/

        List<Car> setToSort = new ArrayList<>();
        setToSort.add(new Car("Audi", 2000));
        setToSort.add(new Car("BMW", 2001));
        setToSort.add(new Car("BMW", 2002));
        setToSort.add(new Car("BMW", 2005));
        setToSort.add(new Car("BMW", 2003));
        setToSort.add(new Car("Mazda", 2000));
        setToSort.add(new Car("BMW", 2004));


        System.out.println(setToSort);

        boolean parametr = false;
        //Collections.sort(setToSort);
        if(parametr) {
            setToSort.sort(new CarPorownywacz());
        } else {
            setToSort.sort(new InnyCarPorownywacz());
        }

        System.out.println(setToSort);
    }
}
