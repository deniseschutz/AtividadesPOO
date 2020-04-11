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
public class Programa {
    public static void main(String[] args){
        //referencia ao objeto, como acessar o objeto
        Conta minhaConta;
        //criando o objeto Conta e acessando através da referência minhaConta 
        minhaConta = new Conta();
        
        minhaConta.dono = "Duke";
        minhaConta.saldo = 1000;
        minhaConta.numero = 1234;
        minhaConta.agencia = 867;
        minhaConta.limite = 50000;
        
        int total = Conta.getTotaldeContas();
        
   
        System.out.println(minhaConta.limite);
        
        System.out.println("Saldo atual: " + minhaConta.saldo);
        
        
        
    }
    
    
}
