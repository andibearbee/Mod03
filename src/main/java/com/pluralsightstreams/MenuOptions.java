package com.pluralsightstreams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

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

        List<Person> searchedPersons = new ArrayList<Person>();

        for (Person person : friendsCharacters) {

            if (person.getFirstName().contains(friendName)) {
                searchedPersons.add(person);
            } else if (person.getLastName().contains(friendName)) {
                searchedPersons.add(person);
            }
        }

        if (searchedPersons.size() == 0) {
            System.out.println("Name not found.");
        } else {
            System.out.println(searchedPersons);
        }
    }


    public static double getAverage(List<Person> friendsCharacters) {

        double sum = 0;
        for (Person person : friendsCharacters) {
            System.out.println(person);

            sum += person.getAge();
        }
        double average = sum / friendsCharacters.size();
        return average;
    }

    public static int getMaxAge(List<Person> friendsCharacters ) {
        int maxAge = 0;

        for (Person person : friendsCharacters) {
            //maxAge

        }
        return maxAge;
    }

    public static int getMinAge(List<Person> friendsCharacters) {
        int minAge = 0;
        for (Person person : friendsCharacters) {
            //minAge
        }
        return minAge;
    }


}
