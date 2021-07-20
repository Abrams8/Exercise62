package com.company;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    private static final PersonGenerator personGenerator = new PersonGenerator();

    private static void showCollection(Collection collection) {
        collection.stream().forEach(System.out::println);
    }


    public static void main(String[] args) {

        List<Person> personList = personGenerator.generatorPers(30);
        showCollection(personList);

        System.out.println("----------------------------");

        List streamList = personList.stream()
                .filter(age -> age.getAge() < 21)
                .peek(x -> System.out.println(x + "\n"))
                .sorted(Comparator.comparing(Person::getSurname).thenComparing(Person::getName))
                .limit(4)
                .map(Person::getSurname)
                .collect(Collectors.toList());

        System.out.println("----------------------------");
        System.out.println(streamList);
    }
}
