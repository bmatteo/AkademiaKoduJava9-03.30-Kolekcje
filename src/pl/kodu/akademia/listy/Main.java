package pl.kodu.akademia.listy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> list = new ArrayList<>();
        //list.add("cos");
        //list.add(5);
        list.add(new Car("BMW", 1999));
        list.add(new Car("BMW", 2000));
        list.add(new Car("BMW", 2001));
        list.add(new Car("BMW", 2002));
        list.add(new Car("BMW", 2003));
        list.add(new Car("BMW", 2004));
        list.add(new Car("BMW", 2005));
        list.add(new Car("BMW", 2006));

        List<Car> list2 = new ArrayList<>();

        list2.add(new Car("Audi", 1999));
        list2.add(new Car("Audi", 2000));

        list.addAll(list2);

        list.remove(1);

        Car c = list.get(3);
        if(c.getBrand().equals("BMW")) {
            list.remove(c);
        }

        list.set(2, null);

        Integer[] tab = new Integer[5];

        Boolean b;
        Float f;
        tab[1] = 1;
        tab[2] = 2;
        tab[3] = 3;
        tab[4] = 4;

        for(int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }

        List<Integer> list3 = new ArrayList<>();

        /*for(Car car : list) {
            System.out.println(car);
        }*/

        System.out.println();
        System.out.println();

        Iterator i = list.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        //list.add(new Pet());

        //System.out.println(list.get(0));

        //Main.jakasMetoda(list);
        //Main.exampleMethod(list);
        //System.out.println(list.get(1));
        //System.out.println(((Car) list.get(2)).getBrand());
        //System.out.println(((Car) list.get(3)).getBrand());

        /*if(list.get(3) instanceof Car) {
            System.out.println("to jest auto !!");
        } else if (list.get(3) instanceof Pet) {
            System.out.println("to jest pet !!");
        }*/
    }

    public static void jakasMetoda(List<Car> list) {

    }

    public static void exampleMethod(List<Car> list) {

    }
}
