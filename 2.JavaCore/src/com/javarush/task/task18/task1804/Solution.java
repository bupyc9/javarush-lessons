package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());

        HashMap<Integer, Integer> map = new HashMap<>();
        while (inputStream.available() > 0) {
            int data = inputStream.read();

            if (map.containsKey(data)) {
                map.put(data, map.get(data) + 1);
            } else {
                map.put(data, 1);
            }
        }
        reader.close();
        inputStream.close();

        int min = 0;
        boolean first = true;
        for (Map.Entry entry : map.entrySet()) {
            if (first) {
                min = (int) entry.getValue();
                first = false;
            }

            if ((int) entry.getValue() < min) {
                min = (int) entry.getValue();
            }
        }

        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue().equals(min)) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
