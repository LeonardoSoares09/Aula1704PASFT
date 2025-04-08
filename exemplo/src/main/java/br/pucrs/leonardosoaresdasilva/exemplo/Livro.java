package br.pucrs.leonardosoaresdasilva.exemplo;

import lombok.*;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Livro {
    
    private int id;
    private String titulo;
    private String autor;
    private int ano;

}
