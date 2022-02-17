package com.projetorest.libraryapi.controllers;

import com.projetorest.libraryapi.dtos.BookDTO;
import com.projetorest.libraryapi.models.Book;
import com.projetorest.libraryapi.services.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BookDTO create(@RequestBody BookDTO bookDTO){
        Book entity =
                Book.builder()
                        .author(bookDTO
                        .getAuthor())
                        .title(bookDTO.getTitle())
                        .isbn(bookDTO.getIsbn())
                        .build();

        entity = bookService.save(entity);

        return BookDTO.builder()
                .id(entity.getId())
                .author(entity.getAuthor())
                .title(entity.getTitle())
                .isbn(entity.getIsbn())
                .build();
    }
}
