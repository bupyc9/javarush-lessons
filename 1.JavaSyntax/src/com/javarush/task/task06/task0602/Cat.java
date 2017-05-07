package com.javarush.task.task06.task0602;

/* 
Пустые кошки, пустые псы
*/

public class Cat {
    public static void main(String[] args) {

    }

    @Override
    protected void finalize() throws Throwable {
        System.out.print("Cat was destroyed");
        super.finalize();
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        System.out.print("Dog was destroyed");
        super.finalize();
    }
}
