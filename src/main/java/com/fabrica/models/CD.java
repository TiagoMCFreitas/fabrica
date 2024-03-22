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
public class CD extends Produto {
    private String nomeAlbum;
    private String banda;
    private String cantor;
    private String genero;
      private int codigo;
    private String descricao;
    private float precoVenda;
    public CD(){
        
    }
    public String getNomeAlbum() {
        return nomeAlbum;
    }

    public void setNomeAlbum(String nomeAlbum) {
        this.nomeAlbum = nomeAlbum;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public CD(String nomeAlbum, String banda, String cantor, String genero,int codigo, String descricao, float precoVenda) {
        super(codigo,descricao,precoVenda,TipoProduto.CD);
        this.nomeAlbum = nomeAlbum;
        this.banda = banda;
        this.cantor = cantor;
        this.genero = genero;
         this.codigo = codigo;
        this.descricao = descricao;
        this.precoVenda = precoVenda;
    }
    
    @Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("CD {\n");
    sb.append("  Nome do Álbum: ").append(nomeAlbum).append("\n");
    sb.append("  Banda: ").append(banda).append("\n");
    sb.append("  Cantor: ").append(cantor).append("\n");
    sb.append("  Gênero: ").append(genero).append("\n");
    sb.append("  Código: ").append(codigo).append("\n");
    sb.append("  Descrição: ").append(descricao).append("\n");
    sb.append("  Preço de Venda: ").append(precoVenda).append("\n");
    sb.append("}");
    return sb.toString();
}
   
    
    
}
