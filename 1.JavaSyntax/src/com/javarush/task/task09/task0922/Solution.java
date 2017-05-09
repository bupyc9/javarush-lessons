package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String dateStr = reader.readLine();

        SimpleDateFormat formatIn = new SimpleDateFormat("M/d/yyyy");
        Date date = formatIn.parse(dateStr);

        SimpleDateFormat formatOut = new SimpleDateFormat("MMM dd, yyyy");
        System.out.println(formatOut.format(date).toUpperCase());
    }
}
