package com.javarush.task.task02.task0218;

/*
Повторенье-мать
*/
public class Solution {
    public static void print3(String s) {
        for (int i = 1; i < 4; i++) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        print3("I love you!");
    }
}