package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        int id = Integer.parseInt(args[0]);

        while(fileReader.ready()) {
            String item = fileReader.readLine();
            String[] fields = item.split(" ");

            int itemId = Integer.parseInt(fields[0]);
            if (itemId == id) {
                System.out.println(item);
                break;
            }
        }
        fileReader.close();
    }
}
