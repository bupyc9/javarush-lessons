package com.javarush.task.task12.task1220;

/* 
Класс Human и интерфейсы Run, Swim
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Swim {
        public void swim();
    }

    public interface Run {
        public void run();
    }

    public abstract class Human implements Swim, Run {

    }
}
