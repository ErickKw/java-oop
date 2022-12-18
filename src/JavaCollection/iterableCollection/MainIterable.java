package JavaCollection.iterableCollection;

import JavaCollection.model.Person;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MainIterable {
    public static void main(String[] args) {
        Iterable<String> names = List.of("Ahmad Roni", "Ahmad Syukur", "Ahmad Subagyo", "Ahmad Bootcamp");
//        for(var name: names){
//            System.out.println(name);
//        }

        Iterable<Person> persons = Arrays.asList(
                new Person(1,"Ahmad Roni","Ciamis"),
                new Person(2,"Ahmad Syahroni","Jakarta"),
                new Person(3,"Ahmad Baehaki","Yogyakarta"),
                new Person(4,"Ahmad Manulang","Medan")
        );

//        for (var peson: persons){
//            System.out.println(peson);
//        }

        Iterable<DetailPerson> detailPeople = Arrays.asList(
                new DetailPerson(1, "Sahidan", "Maulana", 3),
                new DetailPerson(1, "Jindan", "Maulana", 3)
        );

//        for (var detail: detailPeople){
//            System.out.println(detail);
//        }

        Iterator<String> namesIterator = names.iterator();
        while (namesIterator.hasNext()){
            System.out.println(namesIterator.next());
        }
        Iterator<Person> personIterator = persons.iterator();
        while (personIterator.hasNext()){
            System.out.println(personIterator.next());
        }

        Iterator<DetailPerson> detailPerson = detailPeople.iterator();
        while (detailPerson.hasNext()){
            System.out.println(detailPerson.next());
        }

    }
}
