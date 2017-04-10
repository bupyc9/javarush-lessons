package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> items = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            items.add(bufferedReader.readLine());
        }

        int minLength = items.get(0).length();
        int maxLength = items.get(0).length();
        for (int i = 1; i < 10; i++) {
            String item = items.get(i);
            if (item.length() > maxLength) maxLength = item.length();
            if (item.length() < minLength) minLength = item.length();
        }

        for (String item : items) {
            if (
                item.length() == minLength
                || item.length() == maxLength
                ) {
                System.out.println(item);
                break;
            }
        }
    }
}
