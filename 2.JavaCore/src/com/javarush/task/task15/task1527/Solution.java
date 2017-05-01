package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String uri = bufferedReader.readLine();
        String[] list = uri.split("\\?");
        String[] query = list[1].split("&");


        for (String q : query) {
            String[] param = q.split("=");
            System.out.print(param[0] + " ");
        }

        System.out.println();
        for (String q : query) {
            String[] param = q.split("=");
            if (param[0].equals("obj") && !param[1].equals("")) {
                try {
                    alert(Double.parseDouble(param[1]));
                } catch (NumberFormatException e) {
                    alert(param[1]);
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
