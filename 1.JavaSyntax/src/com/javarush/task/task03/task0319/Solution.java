package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String name = bufferedReader.readLine();
        int c1 = Integer.parseInt(bufferedReader.readLine());
        int c2 = Integer.parseInt(bufferedReader.readLine());

        System.out.print(name + " получает " + c1 + " через " + c2 + " лет.");
    }
}
