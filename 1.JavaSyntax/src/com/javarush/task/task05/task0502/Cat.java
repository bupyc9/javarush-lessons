package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        return strength > anotherCat.strength;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.strength = 1;
        cat1.age = 1;
        cat1.weight = 1;

        Cat cat2 = new Cat();
        cat2.strength = 2;
        cat2.age = 2;
        cat2.weight = 3;

        System.out.println(cat2.fight(cat1));
        System.out.println(cat1.fight(cat2));
    }
}
