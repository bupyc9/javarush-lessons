package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        ArrayList<Character> allCharsFromList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            char[] tmpChar = list.get(i).toCharArray();
            for (int j = 0; j < tmpChar.length; j++) {
                allCharsFromList.add(tmpChar[j]);
            }
        }

        for (Character charFromAlphabet : alphabet) {
            int frequencyInList = Collections.frequency(allCharsFromList, charFromAlphabet);
            System.out.println(charFromAlphabet + " " + frequencyInList);
        }
    }

}
