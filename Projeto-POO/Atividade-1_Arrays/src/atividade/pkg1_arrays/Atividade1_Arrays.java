/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade.pkg1_arrays;

/**
 *
 * @author Andressa Freitas
 */
public class Atividade1_Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //array - sempre será um objeto
        //idade é uma referência a posição do armazenamento
        int[] idades;
        //array de 10 posições
        idades = new int[10];
        
        for(int i = 0; i < 10; i++){
            idades[i] = i * 10;
            System.out.println(idades[i]);
        }   
    }
}


