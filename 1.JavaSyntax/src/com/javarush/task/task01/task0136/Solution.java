package com.javarush.task.task01.task0136;

/*
Да хоть на Луну!
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getWeight(888));
    }

    public static double getWeight(int weightEarth) {
        double earth = 9.81;
        double moon = earth * 0.17;
        double weight = weightEarth / earth;

        return weight * moon;
    }
}