package aston.com;

import aston.com.homework_1.model.Person;
import aston.com.homework_3.MyArrayList;
import aston.com.homework_3.MyLinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.updatePerson(12, "Roma");
        System.out.println(person.toString());
        person.updatePerson(-23, "Roma");
        System.out.println(person.toString());

        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.add(34);
        arrayList.add(7);
        arrayList.add(23);
        arrayList.add(32);
        arrayList.add(5);
        arrayList.add(62);
        arrayList.add(12);
        arrayList.add(622);
        arrayList.add(-4);

        System.out.println(arrayList.toString() + "  Len - " + arrayList.size());
        arrayList.remove(4);
        System.out.println(arrayList.toString());
        arrayList.remove(Integer.valueOf(7));
        System.out.println(arrayList.toString() + "  Len - " + arrayList.size());

        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("str5");
        linkedList.add("str6");
        linkedList.add("str7");
        linkedList.add("str1");
        linkedList.add("str2");
        linkedList.add("str3");
        linkedList.add("str4");
        linkedList.add("str5");
        linkedList.add("str6");
        linkedList.add("str7");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i) );
        }
        linkedList.remove(4);
        System.out.println("Len - " + linkedList.size());
        linkedList.remove("str2");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i) );
        }
        System.out.println(" ----------------------  ");
        linkedList.sort();
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i) );
        }

        arrayList.sort(arrayList);
        System.out.println(arrayList.toString() );
    }

}