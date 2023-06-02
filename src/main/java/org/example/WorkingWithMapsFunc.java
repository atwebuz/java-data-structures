package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WorkingWithMapsFunc {
    public static void main(String[] args) {
        Map<Person, Diamond> map = new HashMap<>();
        map.put(new Person("Jamila"), new Diamond("Axmed"));

        System.out.println(new Person("Jamila").hashCode());
        System.out.println(new Person("Jamila").hashCode());
        System.out.println(map.get(new Person("Jamila")));

    }
    private static void maps() {
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

   static class Person{
        String name;

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }

        public Person(String name) {
            this.name = name;
        }

       @Override
       public boolean equals(Object o) {
           if (this == o) return true;
           if (o == null || getClass() != o.getClass()) return false;
           Person person = (Person) o;
           return Objects.equals(name, person.name);
       }

       @Override
       public int hashCode() {
           return Objects.hashCode(name);
       }
   }
    record Diamond(String name){}
}
