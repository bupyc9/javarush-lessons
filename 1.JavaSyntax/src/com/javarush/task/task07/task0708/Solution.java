package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String s = bufferedReader.readLine();
            list.add(s);
        }

        int max = list.get(0).length();
        for (String item : list) {
            if (item.length() > max) {
                max = item.length();
            }
        }

        for (String item : list) {
            if (item.length() != max) {
                continue;
            }

            System.out.println(item);
        }
    }
}
