package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String fileName = consoleReader.readLine();
            if (fileName.equals("end")) {
                break;
            }

            list.add(fileName);
        }

        list.sort(null);

        String f = list.get(0).substring(0, list.get(0).lastIndexOf(".part"));
        FileOutputStream fileOutputStream = new FileOutputStream(f);

        for (String fileName : list) {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            byte[] buffer = new byte[fileInputStream.available()];
            fileInputStream.read(buffer);
            fileInputStream.close();
            fileOutputStream.write(buffer);
        }

        fileOutputStream.close();
    }
}
