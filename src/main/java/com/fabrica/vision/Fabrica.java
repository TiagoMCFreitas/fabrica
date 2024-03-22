/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fabrica.vision;

import com.fabrica.factory.FabricaProdutos;
import com.fabrica.factory.TipoProduto;
import static com.fabrica.factory.TipoProduto.CELULAR;
import static com.fabrica.factory.TipoProduto.LIVRO;
import static com.fabrica.factory.TipoProduto.NOTEBOOK;
import com.fabrica.models.CD;
import com.fabrica.models.Celular;
import com.fabrica.models.Livro;
import com.fabrica.models.Notebook;
import com.fabrica.models.Produto;
import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class Fabrica {
  
    
   private static void imprimirDados(Produto objeto){
                JOptionPane.showMessageDialog(null,        objeto.toString());

    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        boolean controle = true;
        Object[] opcoes = { "LIVRO", "CD", "NOTEBOOK","CELULAR"};
        Object tipoProduto;
        Produto obj = null;
        do{
            tipoProduto = JOptionPane.showInputDialog(null,
                                "Deseja finalizar o programa?",
                                "Finalização",
                                JOptionPane.PLAIN_MESSAGE,
                                null,opcoes,"LIVRO");
            obj = FabricaProdutos.getProduto(tipoProduto.toString());
            imprimirDados(obj);
        }while(controle);
    }
    
}
