package br.pucrs.leonardosoaresdasilva.exemplo;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/biblioteca")

public class ExemploController {

private List<Livro> livros;
 
@GetMapping("/")
 public String getMensagemInicial() {
 return "Aplicacao Spring-Boot funcionando!";
 }

 public ExemploController(){
    this.livros = new ArrayList<>();
    adicionarLivros();
    
 }

 private void adicionarLivros(){
   livros.add( new Livro(1,"O senhor dos aneis", "J.R.R. Tolkien", 1954));
   livros.add( new Livro(1,"Romeu e Julieta", "Luciano", 1999));
   livros.add( new Livro(1,"Harry Potter", "Joao", 2004));
   livros.add( new Livro(1,"Diario de um banana", "Leonardo", 2021));
 }

 @GetMapping("/livros")
 public List<Livro> getLivros() {
     return livros;
 }
 
 @GetMapping("/titulos")
 public List<String> getTitulos() {
     return livros.stream()
            .map(livro->livro.getTitulo())
            .toList();
 }

 @GetMapping("/autores")
 public List<String> getListaAutores() {
     return livros.stream()
             .map(l -> l.getAutor())
             .distinct()
             .toList();
 }

 @GetMapping("/livrosautor")
 public List<Livro> getLivrosAutor(@RequestParam String autor){
    return livros.stream()
          .filter(l -> l.getAutor().equalsIgnoreCase(autor))
          .collect(Collectors.toList());
 }

 @GetMapping("/livrosautorano/{autor}/ano/{ano}")
 public List<Livro> getLivrosPorAutorEAnos(@PathVariable String autor, @PathVariable int ano) {
    return livros.stream()
                 .filter(l -> l.getAutor().equalsIgnoreCase(autor) && l.getAno() == ano)
                 .collect(Collectors.toList());
}
}