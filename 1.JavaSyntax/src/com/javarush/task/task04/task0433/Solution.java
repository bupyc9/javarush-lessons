package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int col = 1;

        while (col <= 10) {
            int row = 1;
            while (row <= 10) {
                System.out.print("S");
                row++;
            }
            System.out.println();

            col++;
        }
    }
}
