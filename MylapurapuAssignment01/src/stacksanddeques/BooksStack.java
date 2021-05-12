/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacksanddeques;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author  Kavya Reddy Mylapurapu
 */
public class BooksStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        AStack<Book> books = new AStack<>();
        AStack<Book> books1 = new AStack<>();
        Scanner sc = new Scanner(new File("books.txt"));
        while (sc.hasNext()) {
            String title = sc.nextLine();
            String author = sc.nextLine();
            Book book = new Book(title, author);
            books.push(book);
            books1.push(book);
        }
        int length = books.size();
        System.out.println("All books in the stack from top to bottom\n"
                + "-------------------------------------");
        for (int i = 0; i < length; i++) {
            System.out.println(books.pop() + "\n-------------------------------------");
        }
        System.out.println("\n\nStack after removing book with name Fantastic Beasts: The Crimes of Grindelwald\n"
                + "-------------------------------------");
        AStack<Book> books3 = new AStack<>();
        int length1=books1.size();
        for (int i = 0; i < length1; i++) {
            if (!books1.peek().getTitle().contains("Fantastic Beasts: The Crimes of Grindelwald")) {
                 System.out.println(books1.pop() + "\n-------------------------------------");
            } else {
                books3.push(books1.pop());
//                 System.out.println(books3.pop() + "\n-------------------------------------");
            }
        }
        AStack<Book> books4 = new AStack<>();
        length = books3.size();
        for (int i = 0; i < length; i++) {
            books4.push(books3.pop());
        }
//        for (int i = 0; i < length; i++) {
//            System.out.println(books4.pop() + "\n-------------------------------------");
//
//        }
    }
}
