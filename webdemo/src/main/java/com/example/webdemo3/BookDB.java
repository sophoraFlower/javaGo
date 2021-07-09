package com.example.webdemo3;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class BookDB {

    private static Map<String, Book> books = new LinkedHashMap<String, Book>();
    static {
        books.put("1", new Book("1", "Java 开发"));
        books.put("2", new Book("2", "Python 开发"));
        books.put("3", new Book("3", "Web 开发"));
        books.put("4", new Book("4", "SQL 开发"));
        books.put("5", new Book("5", "Test 开发"));
    }
    public static Collection<Book> getAll() {
        return books.values();
    }
    public static Book getBook(String id){
        return books.get(id);
    }

}
