package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("Фамилия" + i, "Имя" + i);
        }

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<String> nameListDouble = new ArrayList<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (nameList.contains(entry.getValue())) {
                nameListDouble.add(entry.getValue());
            } else {
                nameList.add(entry.getValue());
            }
        }

        for (String name : nameListDouble) {
            removeItemFromMapByValue(map, name);
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
