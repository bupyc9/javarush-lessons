package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date askDate = new Date(date);
        Date startDate = new Date();
        startDate.setYear(askDate.getYear());
        startDate.setMonth(0);
        startDate.setDate(0);

        long diff = startDate.getTime() - askDate.getTime();
        long day = 24 * 60 * 60 * 1000;
        int countDay = (int) (diff / day);

        return countDay % 2 == 0;
    }
}
