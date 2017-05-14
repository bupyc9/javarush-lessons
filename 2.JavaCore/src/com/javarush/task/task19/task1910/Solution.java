package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = consoleReader.readLine();
        String fileName2 = consoleReader.readLine();

        consoleReader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName2));

        fileWriter.write(fileReader.readLine().replaceAll("[\\p{P}\\n]", ""));

        fileReader.close();
        fileWriter.close();
    }
}
