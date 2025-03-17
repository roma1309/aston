package aston.com;

import aston.com.homework_1.model.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.updatePerson(12, "Roma");
        System.out.println(person.toString());
        person.updatePerson(-23, "Roma");
        System.out.println(person.toString());
    }
}