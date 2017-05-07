package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] names = new String[3];
        names[0] = reader.readLine();
        names[1] = reader.readLine();
        names[2] = reader.readLine();

        FileInputStream file1 = new FileInputStream(names[0]);
        FileOutputStream file2 = new FileOutputStream(names[1]);
        FileOutputStream file3 = new FileOutputStream(names[2]);

        reader.close();

        byte[] buffer;

        if(file1.available() > 0) {
            if (file1.available() % 2 == 0) {
                buffer = new byte[file1.available() / 2];
            } else {
                buffer = new byte[file1.available() / 2 + 1];
            }

            int count;

            count = file1.read(buffer);
            file2.write(buffer, 0, count);

            count = file1.read(buffer);
            file3.write(buffer, 0, count);
        }

        file1.close();
        file2.close();
        file3.close();
    }
}
