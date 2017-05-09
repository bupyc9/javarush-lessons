package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

import java.util.Date;

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private String lastName;
        private String SecondName;
        private boolean sex;
        private int age;
        private Date birthDate;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }

        public Human(String name, String lastName, String secondName) {
            this.name = name;
            this.lastName = lastName;
            SecondName = secondName;
        }

        public Human(String name, String lastName, String secondName, boolean sex) {
            this.name = name;
            this.lastName = lastName;
            SecondName = secondName;
            this.sex = sex;
        }

        public Human(String name, String lastName, String secondName, boolean sex, int age) {
            this.name = name;
            this.lastName = lastName;
            SecondName = secondName;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, String lastName, String secondName, boolean sex, int age, Date birthDate) {
            this.name = name;
            this.lastName = lastName;
            SecondName = secondName;
            this.sex = sex;
            this.age = age;
            this.birthDate = birthDate;
        }

        public Human(String name, String secondName, int age) {
            this.name = name;
            SecondName = secondName;
            this.age = age;
        }

        public Human(String name, String lastName, boolean sex) {
            this.name = name;
            this.lastName = lastName;
            this.sex = sex;
        }

        public Human(String name, int age, Date birthDate) {
            this.name = name;
            this.age = age;
            this.birthDate = birthDate;
        }

        public Human(String name, String lastName, String secondName, Date birthDate) {
            this.name = name;
            this.lastName = lastName;
            SecondName = secondName;
            this.birthDate = birthDate;
        }
    }
}
