package com.activity.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FruitDriver {

    public static void main(String[] args) {


        Fruit apple = new Fruit("Apple", 100);
        Fruit orange = new Fruit("Orange", 50);
        Fruit peach = new Fruit("Peach", 50);
        Fruit apple2 = new Fruit("Apple2", 125);
        Fruit tangerine = new Fruit("Tangerine", 50);
        Fruit banana = new Fruit("Banana", 200);

        List<Fruit> fruits = new ArrayList<Fruit>();

        fruits.add(apple);
        fruits.add(orange);
        fruits.add(peach);
        fruits.add(apple2);
        fruits.add(tangerine);
        fruits.add(banana);

        fruits.forEach(System.out::println);
        System.out.println();

        Collections.sort(fruits);

        fruits.forEach(System.out::println);


    }


}
