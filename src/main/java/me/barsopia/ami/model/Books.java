package me.barsopia.ami.model;

public class Books {
    public String bookName;

    Books() {
    }

    public Books(String name) {
        this.bookName = name;
    }

    public String getName() {
        return this.bookName;
    }
}
