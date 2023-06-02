package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();
        queue.add(new Person("Alex", 22));
        queue.add(new Person("Maria", 18));
        queue.add(new Person("Djon", 32));

        System.out.println(queue.size());
        System.out.println("Eng birinchi elemni oladi: " + queue.peek());
        System.out.println("Eng birinchi elemni o'chradi: " + queue.poll());
        System.out.println(queue.size());
    }

    static record Person(String name, int age){}
}
