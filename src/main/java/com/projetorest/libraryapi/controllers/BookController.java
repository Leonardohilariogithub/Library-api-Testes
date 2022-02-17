package com.projetorest.libraryapi.controllers;

import com.projetorest.libraryapi.dtos.BookDTO;
import com.projetorest.libraryapi.models.Book;
import com.projetorest.libraryapi.services.BookService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private BookService bookService;
    private ModelMapper modelMapper;

    public BookController(BookService bookService,ModelMapper modelMapper) {
        this.bookService = bookService;
        this.modelMapper = modelMapper;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BookDTO create(@RequestBody BookDTO bookDTO){
        Book entity = modelMapper.map(bookDTO, Book.class);

        entity = bookService.save(entity);

        return modelMapper.map(entity, BookDTO.class);
    }
}
