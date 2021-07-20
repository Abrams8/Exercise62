package com.company;

import java.util.Objects;

public class Person {
    private Name name;
    private Surname surname;
    private int age;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Surname getSurname() {
        return surname;
    }

    public void setSurname(Surname surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && name == person.name && surname == person.surname;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", surname=" + surname +
                ", age=" + age +
                '}';
    }

    public Person(Name name, Surname surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person() {

    }
}
