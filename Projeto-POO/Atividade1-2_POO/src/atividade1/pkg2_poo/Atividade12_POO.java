/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade1.pkg2_poo;

/**
 *
 * @author Andressa Freitas
 */
public class Atividade12_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int idade = 15;
        // concatenar expressão utilizando && e
        // concatenar expressão utilizando ׀׀  ou
        boolean amigoDono = true;
        if (idade < 18 && amigoDono == false){
            System.out.println ("Não pode entrar");
        }else {
            System.out.println ("Pode entrar");
        }
        if (idade < 18 && !amigoDono){
            System.out.println ("Não pode entrar");
        }else {
            System.out.println ("Pode entrar");
        }
        
        while (idade < 18) {
        System.out.println (idade);
        idade = idade + 1;
    }
        int i = 0;
        while (i < 10) {
        System.out.println (i);
        i = i + 1;
    }
        for (int j = 0; j < 10; j = j + 1){
            System.out.println ("Oie");
        }
        // break para
        // continue para continuar
        int day = 4;
switch (day) {
  case 1:
    System.out.println("Monday");
    break;
  case 2:
    System.out.println("Tuesday");
    break;
  case 3:
    System.out.println("Wednesday");
    break;
  case 4:
    System.out.println("Thursday");
    break;
  case 5:
    System.out.println("Friday");
    break;
  case 6:
    System.out.println("Saturday");
    break;
  case 7:
    System.out.println("Sunday");
    break;
}
// Outputs "Thursday" (day 4)
/*label1:
    for (; ; ) {
        label2:
        for (; ; ) {
            if (condition1) {
                // break outer loop
                break label1;
            }
            if (condition2) {
                // break inner loop
                break label2;
            }
            if (condition3) {
                // break inner loop
                break;
            }
        }
    }
*/
    }
    }
    

