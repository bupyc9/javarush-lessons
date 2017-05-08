package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Cat vasia = new Cat(reader.readLine());
        Cat murka = new Cat(reader.readLine());
        Cat kotofey = new Cat(reader.readLine(), null, vasia);
        Cat vasilisa = new Cat(reader.readLine(), murka);
        Cat murchik = new Cat(reader.readLine(), vasilisa, kotofey);
        Cat pushina = new Cat(reader.readLine(), vasilisa, kotofey);

        System.out.println(vasia);
        System.out.println(murka);
        System.out.println(kotofey);
        System.out.println(vasilisa);
        System.out.println(murchik);
        System.out.println(pushina);

        reader.close();
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent) {
            this.name = name;
            this.mother = parent;
        }

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
            String m = "Cat name is " + name;

            if (mother == null) {
                m += ", no mother";
            } else {
                m += ", mother is " + mother.name;
            }

            if (father == null) {
                m += ", no father";
            } else {
                m += ", father is " + father.name;
            }

            return m;
        }
    }

}
