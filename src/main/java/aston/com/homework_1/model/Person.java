package aston.com.homework_1.model;

import aston.com.homework_1.exceptions.MyException;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws MyException {
        if (age < 0) {
            throw new MyException("Не верный возраст");
        }
        this.age = age;
    }

    public void updatePerson(int age, String name) {
        try {
            setAge(age);
        } catch (MyException e) {
            System.out.println(e);
        }
        setName(name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
