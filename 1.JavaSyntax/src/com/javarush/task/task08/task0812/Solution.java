package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        reader.close();

        int max = 1;
        int count = 1;
        for (int i = 1; i < 10; i++) {
            if (list.get(i).equals(list.get(i - 1))) {
                count++;
            } else {
                count = 1;
            }
            if (count > max) {
                max = count;
            }
        }

        System.out.println(max);
    }
}