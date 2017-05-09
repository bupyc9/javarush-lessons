package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (str.equals(" ") || str.equals("")) {
                System.out.print(s.substring(i, i + 1).toUpperCase());
            } else {
                System.out.print(s.substring(i, i + 1));
            }

            str = s.substring(i, i + 1);
        }
    }
}
