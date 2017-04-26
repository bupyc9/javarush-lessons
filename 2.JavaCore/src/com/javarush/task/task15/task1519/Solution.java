package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String value = bufferedReader.readLine();

            if (value.equals("exit")) break;

            if (value.contains(".")) {
                print(Double.parseDouble(value));
            } else {
                int valueInt = Integer.parseInt(value);

                if (valueInt > 0 && valueInt < 128) {
                    print((short) valueInt);
                } else if (valueInt > 0 || valueInt >= 128) {
                    print(valueInt);
                } else {
                    print(value);
                }
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
