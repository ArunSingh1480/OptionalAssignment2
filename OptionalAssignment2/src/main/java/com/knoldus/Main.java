package com.knoldus;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        PhoneBookCrawler phoneBookCrawler = new PhoneBookCrawler();

        //Exercise1
        System.out.println("Exercise1");
        System.out.println(phoneBook.findPhoneByName("Shiva"));


        //Exercise2
        System.out.println("--------------");
        System.out.println("Exercise2");
        System.out.println(phoneBookCrawler.findPhoneNumberByNameAndPrintIfNothingFound("Riya"));


        //Exercise3
        System.out.println("--------------");
        System.out.println("Exercise3");
        System.out.println(phoneBookCrawler.findPhoneByNameAndPrintPhoneBookIfNothingFound("Arun"));

        //Exercise4
        System.out.println("--------------");
        System.out.println("Exercise4");
        System.out.println(phoneBookCrawler.findPhoneByNameAndPrintPhoneBookIfNothingFoundUsingToStringMethod("Shiva"));

        //Exercise5
        System.out.println("--------------");
        System.out.println("Exercise5");
        System.out.println(phoneBookCrawler.findPhoneNumberByNameUsingStream("Shiva"));

        //Exercise6
        System.out.println("--------------");
        System.out.println("Exercise6");
        System.out.println(phoneBookCrawler.findPhoneByNameAndPrintPhoneBookIfNothingFoundUsingStreams("Sam"));

        //Exercise7
        System.out.println("--------------");
        System.out.println("Exercise7");
        System.out.println(phoneBookCrawler.findPhoneNumberByNameOrNameByPhoneNumber("Sam", "7898789800"));
    }
}
