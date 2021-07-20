package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class PersonGenerator {

    public List generatorPers(int count) {
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            int s = ThreadLocalRandom.current().nextInt(0, Surname.values().length);
            int n = ThreadLocalRandom.current().nextInt(0, Name.values().length);
            Person person = new Person();
            person.setName(Name.values()[n]);
            person.setSurname(Surname.values()[s]);
            person.setAge(ThreadLocalRandom.current().nextInt(15, 30));
            personList.add(person);
        }
        return personList;
    }
}
