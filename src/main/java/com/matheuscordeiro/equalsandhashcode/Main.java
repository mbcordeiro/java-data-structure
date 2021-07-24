package com.matheuscordeiro.equalsandhashcode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Ford"));
        cars.add(new Car("Chevrolet"));
        cars.add(new Car("Volkswagen"));

        System.out.println(cars.contains(new Car("Ford")));
        System.out.println(new Car("Ford").hashCode());
        System.out.println(new Car("Ford").hashCode());
    }
}
