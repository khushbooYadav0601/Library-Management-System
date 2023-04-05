package com.project.lms.entity;

import lombok.Data;

import javax.persistence.*;

@Data //getter setter
@Entity 
@Table(name = "Books")
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer bookId;
    String bookName;
    String bookAuthor;
    String bookGenre;
    Integer noOfCopies;

    public void borrowBook() {
        this.noOfCopies--;
        //decrease no. of copies when user return book
    }

    public void returnBook() {
        this.noOfCopies++;
        //increase no. of copies when user return book
    }

}
