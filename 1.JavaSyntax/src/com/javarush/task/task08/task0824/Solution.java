package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> children = new ArrayList<>();
        children.add(new Human("1", false, 1));
        children.add(new Human("2", false, 2));
        children.add(new Human("3", false, 3));

        Human mother = new Human("mother", false, 20, children);
        Human father = new Human("father", true, 22, children);

        ArrayList<Human> parent1 = new ArrayList<>();
        parent1.add(mother);

        Human grandFather1 = new Human("grandFather1", true, 40, parent1);
        Human grandMother1 = new Human("grandMother1", true, 40, parent1);

        ArrayList<Human> parent2 = new ArrayList<>();
        parent2.add(father);

        Human grandFather2 = new Human("grandFather2", true, 40, parent2);
        Human grandMother2 = new Human("grandMother2", true, 40, parent2);

        ArrayList<Human> grands = new ArrayList<>();
        grands.add(grandFather1);
        grands.add(grandMother1);
        grands.add(grandFather2);
        grands.add(grandMother2);

        for (Human human : grands) {
            System.out.println(human);
        }

        ArrayList<Human> parents = new ArrayList<>();
        parents.add(mother);
        parents.add(father);

        for (Human parent: parents) {
            System.out.println(parent);
        }

        for (Human child : children) {
            System.out.println(child);
        }
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<>();
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
