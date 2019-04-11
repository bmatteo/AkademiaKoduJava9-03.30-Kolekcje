package pl.kodu.akademia.mapy;

import pl.kodu.akademia.listy.Car;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "jeden");
        map.put(2, "dwa");
        map.put(3, "trzy");
        map.put(4, "cztery");
        map.put(5, "pięć");

        System.out.println("masz " + map.get(5) + " produktów");

        Map<String, Car> auta = new HashMap<>();

        auta.put("BMW", new Car("BMW", 2000));

        System.out.println(auta.get("BMW").getYear());

        System.out.println(map.containsValue("cztery"));

        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

        System.out.println(map.get(0));
    }
}
