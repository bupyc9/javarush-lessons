package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader(args[0]);
        TreeMap<Character, Integer> map = new TreeMap<>();

        while (reader.ready()) {
            char s = (char) reader.read();
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        }

        for (Map.Entry<Character, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }

        reader.close();
    }
}
