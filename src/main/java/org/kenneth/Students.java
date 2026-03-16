package org.kenneth;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String book;

    public Students(){

    }

    public Students(Integer id, String name, String book) {
        this.id = id;
        this.name = name;
        this.book = book;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Students student = (Students) o;
        return id == student.id && Objects.equals(name, student.name) && Objects.equals(book, student.book);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, book);
    }
}
