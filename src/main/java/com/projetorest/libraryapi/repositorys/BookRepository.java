package com.projetorest.libraryapi.repositorys;

import com.projetorest.libraryapi.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository <Book, Long>{
}
