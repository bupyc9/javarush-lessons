package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = bufferedReader.readLine();
        InputStream inputStream = new FileInputStream(fileName);

        while (inputStream.available() > 0) {
            System.out.print((char) inputStream.read());
        }

        inputStream.close();
        bufferedReader.close();
        System.out.println();
    }
}