package JavaCollection.listCollection;

import model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Kintan", "Asmarandani", "Dinda", "Hani"));
        System.out.println(names);

        names.set(2, "Aisyah");
        names.set(0, "Denjaka");
        System.out.println(names);

        List<Person> persons = new ArrayList<>(
                Arrays.asList(
                        new Person(1, "Atik", "Jakarta"),
                        new Person(2, "Kharisma", "Yogyakarta")));

        for (int i = 0; i < persons.size(); i++) {
            System.out.println("Index ke " + i + ":" + persons.get(i));
        }

        System.out.println("\nSetelah dirubah");
        persons.set(1, new Person(2, "Gilang", "Lampung"));
        for (int i = 0; i < persons.size(); i++) {
            System.out.println("Index ke" + i + ":" + persons.get(i));
        }

        List<Person> personList = persons.stream().filter(x -> x.getCity().equals("Medan"))
                .collect(Collectors.toList());
        persons.removeAll(personList);
        System.out.println("\nSetalah Remove All");
        for (int i = 0; i < persons.size(); i++) {
            System.out.println("Index ke " + i + " : " + persons.get(i));
        }

    }
}
