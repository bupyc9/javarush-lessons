package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        Scanner scanner;
        Solution solution = new Solution();
        try {
            fileName = reader.readLine();
            scanner = new Scanner(new FileInputStream(fileName));
            while (scanner.hasNext()) {
                allLines.add(scanner.nextLine());
            }
            scanner.close();

            fileName = reader.readLine();
            scanner = new Scanner(new FileInputStream(fileName));
            while (scanner.hasNext()) {
                forRemoveLines.add(scanner.nextLine());
            }
            scanner.close();

            solution.joinData();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException {
        if (!allLines.containsAll(forRemoveLines)) {
            allLines.clear();
            throw new CorruptedDataException();
        }

        allLines.removeAll(forRemoveLines);
    }
}
