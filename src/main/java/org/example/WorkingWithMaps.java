package org.example;
import java.util.*;
public class WorkingWithMaps {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Alex"));
        map.put(2, new Person("Alexandra"));
        map.put(3, new Person("Maryam"));
        map.put(3, new Person("Maryam"));
        System.out.println(map);
        System.out.println("mapning uzunligi: " + map.size());
        System.out.println("1-elem olish: " + map.get(1));
        System.out.println("4-elem mavjudmi: " + map.containsKey(4));
        System.out.println("keyni qo'sh" + map.keySet());
        System.out.println("ko'rsatish: " + map.entrySet());
        System.out.println("o'chirish: " + map.remove(3));
        map.entrySet().forEach(System.out::println);
        System.out.println("like ternary: " + map.getOrDefault(3, new Person("default")));
        System.out.println("Barcha value larni chqazish: " + map.values());
    }

    /*
    mapda indexlar yani keyla unique bo'lshi kere
    aks xolda value ni ustiga yozadi va 1-indexdan boshlanadi
    */

    record Person(String name){}
}
