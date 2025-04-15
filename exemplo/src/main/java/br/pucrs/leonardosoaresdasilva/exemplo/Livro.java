package br.pucrs.leonardosoaresdasilva.exemplo;

import lombok.*;

@ToString
@Getter
@Setter
@EqualsAndHashCode
public class Livro {

    private int id;
    private String titulo;
    private String autor;
    private int ano;


    public Livro() {
    }

    public Livro(int id, String titulo, String autor, int ano) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }
}
