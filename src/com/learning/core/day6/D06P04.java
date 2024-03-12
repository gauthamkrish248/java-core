package com.learning.core.day06;

import java.text.SimpleDateFormat;
import java.util.*;

class Book2 implements Comparable<Book2> {
    private int bookId;
    private String title;
    private double price;
    private Date publicationDate;
    private String author;

    public Book2(int bookId, String title, double price, Date publicationDate, String author) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.publicationDate = publicationDate;
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = dateFormat.format(publicationDate);
        return bookId + " " + title + " " + price + " " + author + " " + formattedDate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, title, price, publicationDate, author);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book2)) return false;
        Book2 other = (Book2) obj;
        return bookId == other.bookId && Objects.equals(title, other.title)
                && Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
                && Objects.equals(publicationDate, other.publicationDate) && Objects.equals(author, other.author);
    }

    @Override
    public int compareTo(Book2 other) {
        return this.author.compareTo(other.author);
    }
}

public class D06P04 {
    public static void main(String[] args) {
        TreeSet<Book2> books = new TreeSet<>();

        Date date1 = new Date(120, 1, 2);
        Date date2 = new Date(97, 4, 19);
        Date date3 = new Date(84, 10, 23);
        Date date4 = new Date(84, 10, 19);
        Date date5 = new Date(84, 2, 6);

        books.add(new Book2(1001, "Python Learning", 715.0, date1, "Matric C. Brown"));
        books.add(new Book2(1002, "Modern Mainframe", 295.0, date2, "Sharad"));
        books.add(new Book2(1003, "Java Programming", 523.0, date3, "Gilad Bracha"));
        books.add(new Book2(1004, "Read C++", 295.0, date4, "Henry Harvin"));
        books.add(new Book2(1005, ".Net Platform", 3497.0, date5, "Mark J Price"));

        System.out.println("Book Details (Sorted by Author's Name):");
        for (Book2 book : books) {
            System.out.println(book);
        }
    }
}

