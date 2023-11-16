package com.pluralsightstreams;

public class Person implements Comparable<Person>{
    public String firstName, lastName;
    public int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + age;
    }

    @Override
    public int compareTo(Person e){
        if(this.age==e.age)
            return 0;
        else if(this.age>e.age)
            return 1;
        else
            return -1;
    }



}
