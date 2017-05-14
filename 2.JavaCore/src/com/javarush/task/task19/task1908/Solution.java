package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName2));

        String[] items = fileReader.readLine().split(" ");
        ArrayList<String> strings = new ArrayList<>();
        for (String item : items) {
            try {
                Integer number = Integer.parseInt(item);
                strings.add(number.toString());
            } catch (NumberFormatException e) {

            }
        }

        fileWriter.write(String.join(" ", strings));


        fileReader.close();
        fileWriter.close();
    }
}
