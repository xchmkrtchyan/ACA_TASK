package com.company.Stream;

import com.company.IO.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        Person sara = new Person(4,"Sara");
        Person viktor = new Person(40,"Viktor");
        Person eva = new Person(42,"Eva");
        Person anna = new Person(5,"Anna");

        List<Person> personList = Arrays.asList(sara,viktor,eva,anna);
        List<Person> people = personList.stream().filter(person -> person.getAge() < 18).collect(Collectors.toList());
        System.out.println(people);
    }
}
