package com.superdev.lojinha.controller;

import com.superdev.lojinha.model.Produto;
import com.superdev.lojinha.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    //@Autowired
    //private ProdutoRepository repository;
    private final ProdutoRepository repository = new ProdutoRepository();

    @GetMapping
    public List<Produto> listarProdutos() {
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity<Produto> adicionarProduto(@RequestBody Produto produto) {
        Produto novoProduto = repository.create(produto);
        return new ResponseEntity<>(novoProduto, HttpStatus.CREATED);
    }

}
