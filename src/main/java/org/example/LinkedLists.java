package org.example;

import java.util.LinkedList;
import java.util.ListIterator;
public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Alex1", 12));
        linkedList.add(new Person("Alex2", 22));
        linkedList.add(new Person("Alex3", 32));
        ListIterator<Person> personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }

        System.out.println("!!! Reverse !!!");

        while (personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());
        }
    }

    static record Person(String name, int age){}
}
