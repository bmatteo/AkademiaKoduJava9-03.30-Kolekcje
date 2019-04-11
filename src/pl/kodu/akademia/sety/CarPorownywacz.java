package pl.kodu.akademia.sety;

import pl.kodu.akademia.listy.Car;

import java.util.Comparator;

public class CarPorownywacz implements Comparator<Car> {
    @Override
    public int compare(Car car, Car t1) {
        return car.getYear() - t1.getYear();
    }
}
