
package semana2_objeto;

class ContaCorrente extends Conta implements Tributavel{
    public double calculaTributos(){
        return this.getSaldo() * 0.01;
    }
    
}
