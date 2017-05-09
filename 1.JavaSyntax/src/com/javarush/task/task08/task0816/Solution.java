package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        HashMap<String, Date> map = new HashMap<String, Date>();
        for (int i = 0; i < 10; i++) {
            map.put("Stallone" + i, new Date("JUNE 1 198" + i));
        }

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator<Map.Entry<String, Date>> it = map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, Date> entry = it.next();
            if (entry.getValue().getMonth() > 4 && entry.getValue().getMonth() < 8) {
                it.remove();
            }
        }
    }

    public static void main(String[] args) throws ParseException {

    }
}
