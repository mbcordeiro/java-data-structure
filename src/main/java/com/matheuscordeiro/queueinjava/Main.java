package com.matheuscordeiro.queueinjava;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String args[]){

        Queue<Car> cars = new LinkedList<Car>();

        cars.add(new Car("Ford"));
        cars.add(new Car("Chevrolet"));
        cars.add(new Car("Fiat"));
        System.out.println(cars.add(new Car("Peugeot"))); //IllegalStateException
        System.out.println(cars);

        System.out.println(cars.element());//Pega o elemento da cabeça da fila sem remover
        System.out.println(cars);

        System.out.println(cars.offer(new Car("Renault"))); //Retorna false se não conseguir
        System.out.println(cars);

        System.out.println(cars.peek());//Pega o elemento da cabeça da fila e se tiver vazia null
        System.out.println(cars);

        System.out.println(cars.remove()); //Remove
        System.out.println(cars);

        System.out.println(cars.poll()); //Remove ou retorna nulo para caso de fila vazia
        System.out.println(cars);

        System.out.println(cars.isEmpty());
    }
}
