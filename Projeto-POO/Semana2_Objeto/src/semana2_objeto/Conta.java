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
public class Conta {
   //atributos  
    int numero;
    int agencia;
    Cliente titular;
    //saldo e limite não podem ser acessados de fora da classe
    //private é um modificador de acesso ou de visibilidade
    double saldo;
    double limite;
    //private Cliente titular;
    String dono;
    
    //static torna a variável totaldeContas como única e todos os objetos compartilham a mesma.
    //atributo da classe e não mais do objeto.
    private static int totaldeContas;

    //Construtor
    Conta (Cliente titular){
    System.out.println("Construindo uma conta");
    //this não pode ser usado com o static
    //precisará usar o nome da classe
    //this.totaldeContas = this.totaldeContas + 1;
    Conta.totaldeContas = Conta.totaldeContas + 1;
}
    //construtor criado a partir da ajuda do NetBeans
    Conta() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    interface Tributavel {
        double calculaTributos();
    }
    
    public double getSaldo (){
        return this.saldo;
    }
    
    public void setSaldo (double saldo){
        this.saldo = saldo;
    }
    
    public double getLimite (){
        return this.limite;
    }
    
    public void setLimite (double limite){
        this.limite = limite;
    }
    
    public static int getTotaldeContas (){
        return Conta.totaldeContas;
    }
    
   
    
    
   //Método saca()
    void saca (double quantidade){
        double novoSaldo = this.saldo - quantidade;
        if (novoSaldo < -this.limite){
            System.out.println("Saldo insuficiente");
        }
        else {
            this.saldo = novoSaldo;
        }
        
    }

    //Método deposita();
    void deposita (double quantidade){
        this.saldo += quantidade;
    }
    /*descobrir o que esta errado neste código
    //Metodo transfere();
    //com retorno ao objeto que chamou
    boolean saca (double valor){
        if (this.saldo < valor){
            return false;
        }
        else {
            this.saldo = this.saldo - valor;
            return true;
        }
    }
    minhaConta.saldo = 1000;
    boolean consegui = minhaConta.saca(50000){
    if (consegui){
        System.out.println("Consegui sacar");
    }
    else{
        System.out.println("Não consegui sacar");
    }*/
    
}
    
    

