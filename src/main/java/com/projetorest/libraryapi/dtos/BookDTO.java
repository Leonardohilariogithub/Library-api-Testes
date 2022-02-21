package com.projetorest.libraryapi.dtos;

import lombok.*;

import javax.validation.constraints.NotEmpty;

@Getter             //@Data tem @Getter @Setter @ToString
@Setter
@Builder
@NoArgsConstructor  // construtor sem argumentos
@AllArgsConstructor // todos argumentos
public class BookDTO {

    private Long id;

    @NotEmpty
    private String title;

    @NotEmpty
    private String author;

    @NotEmpty
    private String isbn;


}
