
package semana2_objeto;


public class TestaTributavel {
    public static void main (String[] args){
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(100);
        System.out.println(cc.calculaTributos());
        //testando polimorfismo
        Tributavel t = cc;
        System.out.println(t.calculaTributos());
    }
    
}
