/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana2_objeto;

/**
 *
 * @author Andressa Freitas
 */
public class TestarEstouroConta {
    public static void main (String[] args){
        Conta minhaConta = new Conta();
        minhaConta.saldo = 1000;
        minhaConta.limite =1000;
        minhaConta.saca (5000);
    }
    
}
