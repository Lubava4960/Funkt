package Func;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class main {
    public static void main(String[] args) {

        Person person1 = new Person("Ted", 34);
        Person person2 = new Person("Sem", 14);
        Person person3 = new Person("Maik", 24);
        Person person4 = new Person("Vlad", 8);
        Person person5 = new Person("Ted", 18);

        List<Person> people = new ArrayList<>();

        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);

        for (Person person : people) {
            System.out.println(person);
        }

        System.out.println("____________________");

        PersonSortingByAge personSortingByAge = new PersonSortingByAge();
        people.sort(new personSortingByAge());
        for (Person person : people) {
            System.out.println(person);
        }
    }


        static class personSortingByAge implements Comparator<Person> {


            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getAge() > o2.getAge()) {
                    return 1;
                } else if (o1.getAge() < o2.getAge()) {
                    return -1;
                }

                return 0;
            }















        }

}