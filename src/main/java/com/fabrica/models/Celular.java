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
public class Celular extends Produto{
   private String modelo;
   private String marca;
   private String armazenamento;
   private String SO;
   private String telaTamanho;
     private int codigo;
    private String descricao;
    private float precoVenda;

        public Celular(String modelo, String marca, String armazenamento, String SO, String telaTamanho,int codigo, String descricao, float precoVenda) {
        super(codigo,descricao,precoVenda,TipoProduto.CELULAR);
        this.modelo = modelo;
        this.marca = marca;
        this.armazenamento = armazenamento;
        this.SO = SO;
        this.telaTamanho = telaTamanho;
         this.codigo = codigo;
        this.descricao = descricao;
        this.precoVenda = precoVenda;
    }

   
   
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String getSO() {
        return SO;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }

    public String getTelaTamanho() {
        return telaTamanho;
    }

    public void setTelaTamanho(String telaTamanho) {
        this.telaTamanho = telaTamanho;
    }
   @Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Celular {\n");
    sb.append("  Modelo: ").append(modelo).append("\n");
    sb.append("  Marca: ").append(marca).append("\n");
    sb.append("  Armazenamento: ").append(armazenamento).append("\n");
    sb.append("  Sistema Operacional: ").append(SO).append("\n");
    sb.append("  Tamanho da Tela: ").append(telaTamanho).append("\n");
    sb.append("  Código: ").append(codigo).append("\n");
    sb.append("  Descrição: ").append(descricao).append("\n");
    sb.append("  Preço de Venda: ").append(precoVenda).append("\n");
    sb.append("}");
    return sb.toString();
}
   
}
