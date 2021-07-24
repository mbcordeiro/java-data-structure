package com.matheuscordeiro.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String args[]){
        Set<Car> cars = new HashSet<>();

        cars.add(new Car("Ford"));
        cars.add(new Car("Chevrolet"));
        cars.add(new Car("Fiat"));
        cars.add(new Car("Peugeot"));
        cars.add(new Car("Zip"));
        cars.add(new Car("Alfa Romeo"));

        System.out.println(cars);

        Set<Car> treeSetCars = new TreeSet<>();

        treeSetCars.add(new Car("Ford"));
        treeSetCars.add(new Car("Chevrolet"));
        treeSetCars.add(new Car("Fiat"));
        treeSetCars.add(new Car("Peugeot"));
        treeSetCars.add(new Car("Zip"));
        treeSetCars.add(new Car("Alfa Romeo"));

        System.out.println(treeSetCars);

    }
}
