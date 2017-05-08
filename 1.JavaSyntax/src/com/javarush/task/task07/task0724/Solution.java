package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> tree = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            tree.add(new Human("name" + i, i % 2 == 0, i + 20));
        }
        for (int i = 0; i < 5; i++) {
            tree.add(new Human("name" + i, i % 2 == 0, i + 10, tree.get(i % 4), tree.get(i + 1 % 4)));
        }

        for (Human h : tree) {
            System.out.println(h.toString());
        }
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human mother;
        Human father;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















