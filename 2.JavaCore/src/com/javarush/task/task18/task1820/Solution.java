package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        FileInputStream file1 = new FileInputStream(fileName1);
        FileOutputStream file2 = new FileOutputStream(fileName2);

        byte[] data = new byte[file1.available()];
        file1.read(data);
        file1.close();

        String[] numbers = new String(data).split(" ");
        for (String n : numbers) {
            file2.write((Math.round(Double.parseDouble(n)) + " ").getBytes());
        }

        file1.close();
        file2.close();
        reader.close();
    }
}
