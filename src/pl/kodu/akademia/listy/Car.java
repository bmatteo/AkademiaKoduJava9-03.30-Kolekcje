package pl.kodu.akademia.listy;

import java.util.Objects;

public class Car implements Comparable {
    private String brand;
    private int year;

    public Car(String brand, int year) {
        this.year = year;
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.brand);
        builder.append(", ");
        builder.append(this.year);
        return  builder.toString();
    }

    /*@Override
    public boolean equals(Object o) {
        if (!(o instanceof Car)) {
            return false;
        }
        Car c = (Car) o;
        if(c.hashCode() == this.hashCode()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return this.brand.hashCode()+this.year;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year &&
                brand.equals(car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, year);
    }

    @Override
    public int compareTo(Object o) {
        return this.year - ((Car) o).getYear();
    }
}
