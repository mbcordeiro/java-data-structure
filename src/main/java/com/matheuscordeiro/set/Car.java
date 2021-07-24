package com.matheuscordeiro.set;

import java.util.Objects;

public class Car implements Comparable<Car> {
    private String brand;

    public Car() {

    }

    public Car(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Car)) return false;
        Car car = (Car) object;
        return Objects.equals(getBrand(), car.getBrand());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand());
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return this.getBrand().compareTo(o.getBrand());
    }
}