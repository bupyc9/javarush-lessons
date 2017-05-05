package com.javarush.task.task17.task1710;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        String command = args[0];

        if (command.equals("-c")) {
            createPerson(args[1], args[2], args[3]);
        } else if (command.equals("-u")) {
            updatePerson(args[1], args[2], args[3], args[4]);
        } else if (command.equals("-d")) {
            deletePerson(args[1]);
        } else if (command.equals("-i")) {
            printPerson(args[1]);
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
