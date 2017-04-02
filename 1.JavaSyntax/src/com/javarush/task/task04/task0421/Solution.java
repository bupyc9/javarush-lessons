package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String name = bufferedReader.readLine();
        String name1 = bufferedReader.readLine();

        if (name.equals(name1)) {
            System.out.print("Имена идентичны");
        } else if (name.length() == name1.length()) {
            System.out.print("Длины имен равны");
        }
    }
}
