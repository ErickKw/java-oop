package JavaCollection.Deque;

import JavaCollection.model.Person;

import java.util.Deque;
import java.util.LinkedList;

public class MainDeque {
    public static void main(String[] args) {
        Deque <Person> persons =  new LinkedList<>();
        persons.offerLast(new Person(1, "Erick", "Trenggalek"));
        persons.offerFirst(new Person(2, "Kusuma", "Trenggalek"));
        persons.offerLast(new Person(3, "Wardani", "Trenggalek"));

//        persons.offerLast("Kusuma");
//        persons.offerLast("Wardani");

        for (var item = persons.pollLast(); item != null; item = persons.pollLast()){
            System.out.println(item);
        }
    }
}
