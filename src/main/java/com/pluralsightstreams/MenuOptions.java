package com.pluralsightstreams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MenuOptions {

    public static void displayAll(List<Person> friendsCharacters) {
        for (Person person : friendsCharacters) {
            System.out.println(person);
        }
    }

    public static void byAge(List<Person> friendsCharacters) {
        Collections.sort(friendsCharacters);
    }

    public static void searchByName(List<Person> friendsCharacters) {

        Scanner friendsSearch = new Scanner(System.in);
        System.out.println("Enter the Friends name you want to search: ");
        String friendName = friendsSearch.next();

        List<Person> searchedPersons = friendsCharacters.stream()
                .filter(person -> person.getFirstName().contains(friendName) || person.getLastName().contains(friendName))
                .collect(Collectors.toList());

//        This loop does the same thing as the stream above
//        for (Person person : friendsCharacters) {
//
//            if (person.getFirstName().contains(friendName)) {
//                searchedPersons.add(person);
//            } else if (person.getLastName().contains(friendName)) {
//                searchedPersons.add(person);
//            }
//        }

        if (searchedPersons.size() == 0) {
            System.out.println("Name not found.");
        } else {
            System.out.println(searchedPersons);
        }
    }


    public static double getAverage(List<Person> friendsCharacters) {

        double sum = friendsCharacters.stream().mapToInt(Person::getAge).reduce(0, (temp, age) -> temp += age);
        double average = sum / friendsCharacters.size();
        System.out.println(average);
        return average;

//        This loop functions like the stream above
//        for (Person person : friendsCharacters) {
//            System.out.println(person);
//
//            sum += person.getAge();
//        }

    }

    public static int getMaxAge(List<Person> friendsCharacters) {
        int maxAge = friendsCharacters.stream().mapToInt(Person :: getAge).max().orElse(0);

//        for (Person person : friendsCharacters) {
//            //maxAge
//
//        }
        System.out.println(maxAge);
            return maxAge;
    }

    public static int getMinAge(List<Person> friendsCharacters) {
        int minAge = friendsCharacters.stream()
                .mapToInt(Person::getAge)
                .min()
                .orElse(0);

//        for (Person person : friendsCharacters) {
//        }
//
        System.out.println(minAge);
        return minAge;
    }


}
