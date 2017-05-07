package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        FileInputStream inputStream = new FileInputStream(fileName1);
        FileOutputStream outStream = new FileOutputStream(fileName2);

        byte[] buffer = new byte[inputStream.available()];
        for (int i = inputStream.read(buffer)-1; i >= 0 ; i--) {
            outStream.write(buffer[i]);
        }

        reader.close();
        inputStream.close();
        outStream.close();
    }
}
