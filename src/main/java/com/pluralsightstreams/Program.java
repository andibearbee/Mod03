package com.pluralsightstreams;

import java.util.*;

import static com.pluralsightstreams.MenuOptions.*;

public class Program {
    public static void main(MenuOptions) {

            System.out.println("Welcome to all things Friends!" + "\n" + "What would you like to do? \n" +
                    "Options: \n" +
                    " 1: Display All Friends \n" +
                    "2: Search Friends by Name \n" +
                    "3: Sort by Age \n" +
                    "4: Average Age of all Characters \n" +
                    "5: Oldest Friend \n" + "6: Youngest Friend \n");

            List<Person> friendsCharacters = new ArrayList<Person>();
            friendsCharacters.add(new Person("Phoebe", "Buffay", 26));
            friendsCharacters.add(new Person("Joey", "Tribbiani", 25));
            friendsCharacters.add(new Person("Chandler", "Bing", 26));
            friendsCharacters.add(new Person("Monica", "Geller-Bing", 24));
            friendsCharacters.add(new Person("Ross", "Geller", 26));
            friendsCharacters.add(new Person("Rachel", "Green", 24));
            friendsCharacters.add(new Person("Gunther", "Central-Perk", 31));
            friendsCharacters.add(new Person("Mike", "Hannigan", 26));
            friendsCharacters.add(new Person("Ben", "Geller", 7));
            friendsCharacters.add(new Person("Emma", "Geller-Green", 2));


            Scanner scanner = new Scanner(System.in);
            int menuChoice = scanner.nextInt();

            switch (menuChoice) {
                    case 1:
                            displayAll();

                            //cases continue


            }


    }







}
