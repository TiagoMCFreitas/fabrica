/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fabrica.models;

import com.fabrica.factory.TipoProduto;

/**
 *
 * @author tiago
 */
public class Livro extends Produto{
    private String autor;
    private String tradutor;
    private String editora;
    private String anoPublicacao;
     private int codigo;
    private String descricao;
    private float precoVenda;
    
    
    
    public Livro(String autor, String tradutor, String editora, String anoPublicacao,int codigo, String descricao, float precoVenda) {
        super(codigo,descricao,precoVenda,TipoProduto.LIVRO);
        this.autor = autor;
        this.tradutor = tradutor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
         this.codigo = codigo;
        this.descricao = descricao;
        this.precoVenda = precoVenda;
    }

    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTradutor() {
        return tradutor;
    }

    public void setTradutor(String tradutor) {
        this.tradutor = tradutor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(String anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    @Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Livro {\n");
    sb.append("  Código: ").append(codigo).append("\n");
    sb.append("  Descrição: ").append(descricao).append("\n");
    sb.append("  Autor: ").append(autor).append("\n");
    sb.append("  Tradutor: ").append(tradutor).append("\n");
    sb.append("  Editora: ").append(editora).append("\n");
    sb.append("  Ano de Publicação: ").append(anoPublicacao).append("\n");
    sb.append("  Preço de Venda: ").append(precoVenda).append("\n");
    sb.append("}");
    return sb.toString();
}

    
}
