/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacksanddeques;

/**
 *
 * @author  Kavya Reddy Mylapurapu
 */
public class Book {

    private String title;
    private String author;

    /**
     * This is a parameterized constructor which initializes the arguments as per provided 
     * @param title title of book
     * @param author author of book
     */
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    /**
     * This method is used to get title of book
     * @return a string which contains title of book
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method is used to get author of book
     * @return a String which gets author of the book
     */
    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return getTitle() + "\n" + getAuthor();
    }
}