package br.pucrs.leonardosoaresdasilva.exemplo;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/biblioteca")

public class ExemploController {

private List<Livro> livros;
 
@GetMapping("/")
 public String getMensagemInicial() {
 return "Aplicacao Spring-Boot funcionando!";
 }

 @GetMapping("/livros")
 public String getLivros() {
 return "Endpoint de livros...";
 }

 public ExemploController(List<Livro> livro){
    this.livro = new ArrayList();
    
 }


}