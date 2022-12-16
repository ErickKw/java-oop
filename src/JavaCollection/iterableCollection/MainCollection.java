package JavaCollection.iterableCollection;

import model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class MainCollection {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("Bang Jindan");
        names.add("Udin");
        names.addAll(List.of("Dinda", "Elvina", "Dini"));

        for (String name : names) {
            System.out.println(name);
        }

        Collection<Person> persons = new ArrayList<>();
        persons.add(new Person(1, "Denjaka", "Surabaya"));
        persons.add(new Person(2, "Deka", "Surabaya"));
        persons.add(new Person(3, "Sylla", "Surabaya"));

        persons.addAll(Arrays.asList(new Person(4, "Kintan", "Kediri")));
        persons.addAll(Arrays.asList(
                new Person(5, "Kiffty", "Nganjuk"),
                new Person(6, "Diki", "Surabaya")));

        for (Person p : persons) {
            System.out.println(p);
        }
    }
}
