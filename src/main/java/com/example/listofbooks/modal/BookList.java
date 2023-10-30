package com.example.listofbooks.modal;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;


@Component
public class BookList {

    private Long bookId;
    private String author;
    private String bookname;
    public BookList(){

    }
    public BookList(String author,String bookname){
        this.bookname=bookname;
        this.author=author;
    }
    public Long getBookId(){
        return bookId;
    }
    public void setBookId(Long bookId){
     this.bookId=bookId;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public String getBookName(){
        return bookname;
    }
    public void setBookName(String bookname){
        this.bookname=bookname;
    }

}
