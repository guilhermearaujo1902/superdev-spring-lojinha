package com.superdev.lojinha.repository;

import com.superdev.lojinha.model.Produto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProdutoRepository {

    List<Produto> listaProdutos = new ArrayList<>();
    int idSequencia = 0;

    public List<Produto> findAll() {
        return this.listaProdutos;
    }

    public Produto findById(int id) {
        for (Produto produto : this.listaProdutos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    public Produto create(Produto produto) {
        produto.setId(this.getIdSequencia());
        this.listaProdutos.add(produto);
        return produto;
    }

    public Produto alter(Produto novoProduto) {
        Produto produtoAtual = findById(novoProduto.getId());

        this.listaProdutos.remove(produtoAtual);
        this.listaProdutos.add(novoProduto);

        return novoProduto;
    }

    public Produto delete(int id) {
        Produto produtoExcluido = this.findById(id);

        this.listaProdutos.remove(produtoExcluido);
        return produtoExcluido;
    }

    private int getIdSequencia(){
        this.idSequencia++;
        return this.idSequencia;
    }

}
