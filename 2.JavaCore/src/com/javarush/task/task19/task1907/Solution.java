package com.javarush.task.task19.task1907;

/* 
Считаем слово
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

        FileReader fileReader = new FileReader(fileName);

        int c = 0;
        StringBuilder s = new StringBuilder();
        while(fileReader.ready()) {
            s.append(String.valueOf((char) fileReader.read()));
        }

        String[] world = s.toString().split("\\bworld\\b");
        System.out.println(world.length - 1);

        fileReader.close();
    }
}
