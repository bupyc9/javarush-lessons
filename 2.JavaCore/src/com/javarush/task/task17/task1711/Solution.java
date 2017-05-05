package com.javarush.task.task17.task1711;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    int count = (args.length - 1) / 3;
                    int c1 = 1;
                    int c2 = 2;
                    int c3 = 3;
                    for (int i = 0; i < count; i++) {
                        createPerson(args[c1], args[c2], args[c3]);
                        c1 += 3;
                        c2 += 3;
                        c3 += 3;
                    }
                    break;
                }
            case "-u":
                synchronized (allPeople) {
                    int count = (args.length - 1) / 4;
                    int c1 = 1;
                    int c2 = 2;
                    int c3 = 3;
                    int c4 = 4;
                    for (int i = 0; i < count; i++) {
                        updatePerson(args[c1], args[c2], args[c3], args[c4]);
                        c1 += 4;
                        c2 += 4;
                        c3 += 4;
                        c4 += 4;
                    }
                    break;
                }
            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        deletePerson(args[i]);
                    }
                    break;
                }
            case "-i":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        printPerson(args[i]);
                    }
                    break;
                }
        }
    }

    private static void createPerson(String name, String sex, String bd) throws ParseException {
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        if (sex.equals("м")) {
            allPeople.add(Person.createMale(name, format.parse(bd)));
        } else {
            allPeople.add(Person.createFemale(name, format.parse(bd)));
        }

        System.out.println(allPeople.size() - 1);
    }

    private static void updatePerson(String id, String name, String sex, String bd) throws ParseException {
        Person person = allPeople.get(Integer.parseInt(id));
        person.setName(name);
        person.setSex(sex.equals("м") ? Sex.MALE : Sex.FEMALE);
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        person.setBirthDay(format.parse(bd));
    }

    private static void deletePerson(String id) {
        Person person = allPeople.get(Integer.parseInt(id));
        person.setName(null);
        person.setSex(null);
        person.setBirthDay(null);
    }

    private static void printPerson(String id) {
        Person person = allPeople.get(Integer.parseInt(id));
        SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        String message = person.getName();
        message += " " + (person.getSex() == Sex.MALE ? "м" : "ж");
        message += " " + format.format(person.getBirthDay());

        System.out.println(message);
    }
}
