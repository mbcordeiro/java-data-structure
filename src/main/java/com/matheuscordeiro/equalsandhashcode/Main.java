package com.matheuscordeiro.equalsandhashcode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    List<Car> cars = new ArrayList<>();

    cars.add(new Carro("Ford"));
    cars.add(new Carro("Chevrolet"));
    cars.add(new Carro("Volkswagen"));

    System.out.println(cars.contains(new Carro("Ford")));
    System.out.println(new Carro("Ford").hashCode());
    System.out.println(new Carro("Ford").hashCode());
}
