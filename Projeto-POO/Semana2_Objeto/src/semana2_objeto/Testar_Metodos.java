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
public class Testar_Metodos {
    public static void main (String[] args){
        //criar a conta
        Conta contaDE;
        contaDE = new Conta();
        
        //atribuir valores a conta
        contaDE.dono = "Denise";
        contaDE.saldo = 20000;
        
        //sacar 200 reais
        contaDE.saca(200);
        
        //depositar 500 reais
        contaDE.deposita(500);
        System.out.println(contaDE.saldo);
        
        
        
        
        
    }
    
}
