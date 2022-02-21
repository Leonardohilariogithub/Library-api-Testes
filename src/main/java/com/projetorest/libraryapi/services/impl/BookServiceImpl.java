package com.projetorest.libraryapi.services.impl;

import com.projetorest.libraryapi.models.Book;
import com.projetorest.libraryapi.repositorys.BookRepository;
import com.projetorest.libraryapi.services.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {


    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }
}
