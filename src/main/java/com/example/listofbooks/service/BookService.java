package com.example.listofbooks.service;

import com.example.listofbooks.modal.BookList;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class BookService {
    private List<BookList> l1=new ArrayList<>();
    private Long id1=1L;

    public List<BookList> getAllBooks(){
        return l1;
    }
    public BookList createBook(BookList booklist){
        booklist.setBookId(id1);
        id1++;
        l1.add(booklist);
        return booklist;
    }
    public BookList getBookById(Long id){
        for(int i=0;i<l1.size();i++){
            if(l1.get(i).getBookId().equals(id)){
                return l1.get(i);
            }
        }
        return null;
    }
    public BookList updateBook(Long id,BookList updateBook){
        for (int i = 0; i < l1.size(); i++) {
            if (l1.get(i).getBookId().equals(id)) {
                updateBook.setBookId(id);
                l1.set(i, updateBook);
                return updateBook;
            }
        }
        return null;
    }
    public void deleteBook(Long id){
        l1.removeIf(book -> book.getBookId().equals(id));
    }
}
