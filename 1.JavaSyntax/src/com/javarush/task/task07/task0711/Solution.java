package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> items = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            items.add(bufferedReader.readLine());
        }

        for (int i = 1; i <= 13; i++) {
            String item = items.get(4);
            items.remove(4);
            items.add(0, item);
        }

        for (String item : items) {
            System.out.println(item);
        }
    }
}
