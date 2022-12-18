package JavaCollection.QueueInterface;

import JavaCollection.model.Person;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args) {
        Queue<Person> persons = new ArrayDeque<>();
        persons.offer(new Person(1,"Erick", "Jakarta"));
        persons.offer(new Person(1, "Dinda", "Surabaya"));
        persons.offer(new Person("Diana", List.of("Basket", "Coding")));


        for(Person next = persons.poll(); next != null; next = persons.poll()){
            System.out.println(next);
        }

        System.out.println(persons.size());
    }
}
