package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> items = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            items.add(bufferedReader.readLine());
        }

        int minLength = items.get(0).length();
        for (int i = 1; i < items.size(); i++) {
            if (items.get(i).length() > minLength) {
                continue;
            }

            minLength = items.get(i).length();
        }

        for (String item : items) {
            if (item.length() != minLength) {
                continue;
            }

            System.out.println(item);
        }
    }
}