package com.company;


import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Declare variables

        Scanner keyboard = new Scanner(System.in);

        ArrayList<Book> library = new ArrayList<Book>();

        int size = 50;
        int counter = 0;
        String title[] = new String[size];
        String author[] = new String[size];
        String description[] = new String[size];
        String answer="y";

        //Add a book
        //Create book from object

        while(answer.equalsIgnoreCase("y"))
        {
            System.out.println("Do you want to enter a book?");
            answer=keyboard.nextLine();

            if(answer.equalsIgnoreCase("y")) {

                Book book = new Book();
                System.out.println("Enter the title:");
                book.title = keyboard.nextLine();
                System.out.println("Enter the author:");
                book.author = keyboard.nextLine();
                System.out.println("Enter the description:");
                book.description = keyboard.nextLine();
                library.add(book);
            }
        }
        //Print all books in array list

        System.out.println("All the books:");

        for(Book book:library)
        {
            System.out.print(book.title);
            System.out.print(" ");
            System.out.print(book.author);
            System.out.print(" ");
            System.out.print(book.description);
            System.out.println();
        }
    }
}

