package JavaCollection.sortedSet;

import JavaCollection.model.Person;

import java.util.*;
import java.util.stream.Collectors;

public class MainSortedSet {
    public static void main(String[] args) {
        SortedSet<Person> persons = new TreeSet<>(new PersonComparator());
        persons.add(new Person(1, "Dinda", "Jakarta"));
        persons.add(new Person(2, "Erick", "Jakarta"));
        persons.add(new Person(3, "Elvina", "Surabaya"));
        persons.add(new Person(4, "Diki", "Bekasi"));

        for (Person p: persons){
            System.out.println(p);
        }

        System.out.println("\nNavigableSet");
        NavigableSet<Person> personNav = new TreeSet<>(new PersonComparator());
        personNav.add(new Person(1,"Anis","Jakarta"));
        personNav.add(new Person(2,"Ganjar","Semarang"));
        personNav.add(new Person(3,"Prabowo","Jakarta"));
        personNav.add(new Person(4,"Sukarwo","Surabaya"));
        for (Person p: personNav){
            System.out.println(p);
        }

        System.out.println("\nNavigableSet dibalik");
        List<Person> personNav2 = personNav.stream().sorted(Comparator.comparing(Person::getName).reversed())
                .collect(Collectors.toList());
        for (Person p: personNav2){
            System.out.println(p);
        }


    }
}
