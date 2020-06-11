package me.barsopia.ami.model;

public class Student {
    public String name;
    Books book = new Books();

    public Student(String name) {
        this.name = name;
    }

    public Books getBook() {
        return book;
    }

    public void takeBook(Books givenBook) {
        book.bookName = givenBook.bookName;
    }
}

