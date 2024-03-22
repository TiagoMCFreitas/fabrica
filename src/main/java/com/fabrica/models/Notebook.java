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
public class Notebook extends Produto{
    private String marca;
    private String modelo;
    private String ram;
    private String capacidadeArmazenamento;
    private String processador;
    private String tamanhoTela;
    private String SO;
      private int codigo;
    private String descricao;
    private float precoVenda;

    public Notebook(String marca, String modelo, String ram, String capacidadeArmazenamento, String processador, String tamanhoTela, String SO,int codigo, String descricao, float precoVenda) {
        super(codigo,descricao,precoVenda,TipoProduto.NOTEBOOK);
        this.marca = marca;
        this.modelo = modelo;
        this.ram = ram;
        this.capacidadeArmazenamento = capacidadeArmazenamento;
        this.processador = processador;
        this.tamanhoTela = tamanhoTela;
        this.SO = SO;
        this.codigo = codigo;
        this.descricao = descricao;
        this.precoVenda = precoVenda;
        
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getCapacidadeArmazenamento() {
        return capacidadeArmazenamento;
    }

    public void setCapacidadeArmazenamento(String capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(String tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public String getSO() {
        return SO;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }
    
    @Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Notebook {\n");
    sb.append("  Modelo: ").append(modelo).append("\n");
    sb.append("  Marca: ").append(marca).append("\n");
    sb.append("  Armazenamento: ").append(capacidadeArmazenamento).append("\n");
    sb.append("  Sistema Operacional: ").append(SO).append("\n");
    sb.append("  Tamanho da Tela: ").append(tamanhoTela).append("\n");
    sb.append("  Código: ").append(codigo).append("\n");
    sb.append("  Descrição: ").append(descricao).append("\n");
    sb.append("  Preço de Venda: ").append(precoVenda).append("\n");
    sb.append("}");
    return sb.toString();
}

    
}
