package com.matheuscordeiro.stackinjava;

import java.util.Stack;

public class Main {
    public static void main(String args[]){
        Stack<Car> cars = new Stack<>();

        cars.push(new Car("Ford"));
        cars.push(new Car("Chevrolet"));
        cars.push(new Car("Fiat"));

        System.out.println(cars);
        System.out.println(cars.pop());
        System.out.println(cars);

        System.out.println(cars.peek());
        System.out.println(cars);

        System.out.println(cars.empty());
    }
}
