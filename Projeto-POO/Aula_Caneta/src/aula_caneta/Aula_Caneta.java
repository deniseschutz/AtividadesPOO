
package aula_caneta;

public class Aula_Caneta {


    public static void main(String[] args) {
        // TODO code application logic here
        //classe Caneta
        //objeto c1
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        //c1.tampada = false;
        //chamada ao método
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.cor = "Preta";
        c2.carga = 30;
        c2.ponta = 0.7f;
     
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
    
}
