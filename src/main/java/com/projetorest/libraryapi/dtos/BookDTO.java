package com.projetorest.libraryapi.dtos;

import lombok.*;

@Getter             //@Data tem @Getter @Setter @ToString
@Setter
@Builder
@NoArgsConstructor  // construtor sem argumentos
@AllArgsConstructor // todos argumentos
public class BookDTO {

    private Long id;
    private String title;
    private String author;
    private String isbn;


}
