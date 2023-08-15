package com.dj.bookms.repository;

import com.dj.bookms.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

    public Book getBookByIsbn(String isbn);
}