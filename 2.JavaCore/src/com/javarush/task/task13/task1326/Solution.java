package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = bufferedReader.readLine();
        Scanner scanner = new Scanner(new FileInputStream(fileName));

        List<Integer> list = new ArrayList<>();

        while (scanner.hasNext()) {
            int data = scanner.nextInt();

            if ((int) data % 2 == 0) {
                list.add(data);
            }
        }

        Collections.sort(list);

        for (int i : list) {
            System.out.println(i);
        }

        System.out.println();

        bufferedReader.close();
        scanner.close();
    }
}
