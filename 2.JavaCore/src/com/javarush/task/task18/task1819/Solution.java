package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        FileInputStream file1Input = new FileInputStream(fileName1);
        byte[] data = new byte[file1Input.available()];
        int c = file1Input.read(data);
        file1Input.close();

        FileOutputStream file1 = new FileOutputStream(fileName1);
        FileInputStream file2 = new FileInputStream(fileName2);

        while(file2.available() > 0) {
            file1.write(file2.read());
        }

        file1.write(data);

        file1.close();
        file2.close();

        reader.close();
    }
}
