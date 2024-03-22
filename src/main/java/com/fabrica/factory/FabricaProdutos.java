/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fabrica.factory;

import static com.fabrica.factory.TipoProduto.CELULAR;
import static com.fabrica.factory.TipoProduto.LIVRO;
import static com.fabrica.factory.TipoProduto.NOTEBOOK;
import com.fabrica.models.CD;
import com.fabrica.models.Celular;
import com.fabrica.models.Livro;
import com.fabrica.models.Notebook;
import com.fabrica.models.Produto;

/**
 *
 * @author tiago
 */
public class FabricaProdutos {
     public static Produto getProduto(String tipoProduto){
         System.out.println(tipoProduto);
        TipoProduto tipo = TipoProduto.valueOf(tipoProduto);
        switch (tipo){
            case LIVRO:
                return new Livro("George Orwell", "John Smith", "Editora ABC", "1949",
                                 11231, "Descrição do Livro 1984", 39.99f);
            case CD:
                return new CD("A Night at the Opera", "Queen", "Fred Mercury", "Rock",
                        13332, "CD do grande sucesso Bohemian Rhapsody", 29.99f);
            case CELULAR:
                return new Celular("Iphone15", "Apple", "512GB", "IOS", "7.6 polegadas",
                                  11453, "Celular com a melhor camera do mercado", 1500.0f);
            case NOTEBOOK:
                return new Notebook("Lenovo", "V14", "16GB", "512GB",
                                  "Intel Core i7", "15.6 polegadas", "Windows 11",
                                  21257, "Notebook Para Trabalho", 1500.0f);
            default:
                return null;
        }
    }
    
}
