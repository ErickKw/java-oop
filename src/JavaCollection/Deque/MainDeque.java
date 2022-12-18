package JavaCollection.Deque;

import JavaCollection.model.Person;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class MainDeque {
    public static void main(String[] args) {
        Deque <Person> persons =  new LinkedList<>();
        persons.offerLast(new Person(1, "Erick", "Trenggalek"));
        persons.offerFirst(new Person(2, "Kusuma", "Trenggalek"));
        persons.offerLast(new Person(3, "Wardani", "Trenggalek"));
        for (var item = persons.pollLast(); item != null; item = persons.pollLast()){
            System.out.println(item);
        }


        Deque <String> persons2 =  new ArrayDeque<>();
        persons2.offerLast("Denjaka");
        persons2.offerLast("Wardani");
        persons2.offerFirst("Kusuma");


        for (var item = persons2.pollLast(); item != null; item = persons2.pollLast()){
            System.out.println(item);
        }
    }
}
