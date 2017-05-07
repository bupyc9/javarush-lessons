package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());

        List<Integer> list = new ArrayList<>();
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if (!list.contains(data)) {
                list.add(data);
            }
        }
        reader.close();
        inputStream.close();

        Collections.sort(list);
        for (Integer data : list) {
            System.out.print(data + " ");
        }
    }
}
