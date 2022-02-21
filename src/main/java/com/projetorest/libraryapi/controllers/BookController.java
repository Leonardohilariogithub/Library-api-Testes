package com.projetorest.libraryapi.controllers;

import com.projetorest.libraryapi.dtos.BookDTO;
import com.projetorest.libraryapi.exceptions.ApiErrors;
import com.projetorest.libraryapi.models.Book;
import com.projetorest.libraryapi.services.BookService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private BookService bookService;
    private ModelMapper modelMapper;
    private BindingResult bindingResult;

    public BookController(BookService bookService,ModelMapper modelMapper) {
        this.bookService = bookService;
        this.modelMapper = modelMapper;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BookDTO create(@RequestBody @Valid BookDTO bookDTO){
        Book entity = modelMapper.map(bookDTO, Book.class);

        entity = bookService.save(entity);

        return modelMapper.map(entity, BookDTO.class);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiErrors handValidationExptions(MethodArgumentNotValidException ex){
        return  new ApiErrors(bindingResult);
    }

}
