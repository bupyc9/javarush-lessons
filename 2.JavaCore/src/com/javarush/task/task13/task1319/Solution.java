package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Запись в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = bufferedReader.readLine();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));

        while (true) {
            String data = bufferedReader.readLine();

            bufferedWriter.write(data);
            bufferedWriter.newLine();

            if (data.equals("exit")) {
                break;
            }
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
