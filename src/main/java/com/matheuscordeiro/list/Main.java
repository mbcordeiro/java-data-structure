package com.matheuscordeiro.list;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]){

        List<Car> cars = new ArrayList<Car>();

        cars.add(new Car("Ford"));
        cars.add(new Car("Chevrolet"));
        cars.add(new Car("Fiat"));
        cars.add(new Car("Peugeot"));

        System.out.println(cars.contains(new Car("Ford")));

        System.out.println(cars.get(2));

        System.out.println(cars.indexOf(new Car("Fiat")));

        System.out.println(cars.remove(2));

        System.out.println(cars);
    }

}
