package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(bufferedReader.readLine()));
        }

        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> listOther = new ArrayList<>();

        for (Integer item : list) {
            if (item % 3 == 0 && item % 2 == 0) {
                list3.add(item);
                list2.add(item);
            } else if (item % 3 == 0) {
                list3.add(item);
            } else if (item % 2 == 0) {
                list2.add(item);
            } else {
                listOther.add(item);
            }
        }

        printList(list3);
        printList(list2);
        printList(listOther);
    }

    public static void printList(List<Integer> list) {
        for (Integer item : list) {
            System.out.println(item);
        }
    }
}
