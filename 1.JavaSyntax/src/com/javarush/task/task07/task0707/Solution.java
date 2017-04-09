package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            list.add("test" + i);
        }

        System.out.println(list.size());
        for (String item : list) {
            System.out.println(item);
        }
    }
}
