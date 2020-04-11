/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atvidade2_poo;

/**
 *
 * @author Andressa Freitas
 */
public class Atvidade2_POO {

    /**
     * @param args the command line arguments
     */
    /*public static void main(String[] args) {
        // TODO code application logic here
        int idade;
        idade = 15;
        System.out.println (idade);
        int idadeAnoqueVem;
        idadeAnoqueVem = idade +1;
        System.out.println (idadeAnoqueVem);
        // operador soma +
        int quatro = 2 + 2;
        System.out.println (quatro);
        // operador subtração -
        int tres = 5 - 2;
        System.out.println (tres);
        // operador multiplicação *
        int oito = 4 * 2;
        System.out.println (oito);
        // operador divisão /
        int dezesseis = 64 / 4;
        System.out.println (dezesseis);
        // operador módulo %
        int um = 5 % 2; // 5 dividido por 2 dá 2 e tem resto 1;
        System.out.println (um);
        // o operador % pega o resto da divisão inteira
    }*/
    //BalancoTrimestral
    public static void main (String[] args) {
        
        short gastosJaneiro =15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;
        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        System.out.println (gastosTrimestre);
        
        //Para isso, concatene a String com o valor, usando "Valor da
        //média mensal = " + mediaMensal
        // VERIFICAR o que a a tividade deseja fazer
        double mediaMensal = gastosTrimestre / 3;
        System.out.println(mediaMensal);
        
        // casting, é o arredondamento
        int valorTruncado = (int) mediaMensal;
        System.out.println(valorTruncado);
    }
    
}
