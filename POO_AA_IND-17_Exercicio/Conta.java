/**
 *
 * @author Danilo Loschiavo
 */
public class Conta {
    
    private double saldo;
    private String tipo;
    
    public Conta(double valorInicial){
        //Por padrao tipo da conta é corrente
        saldo = valorInicial;
        tipo = "Corrente";
    }
    
    public Conta(double valorInicial, String tipo){
        saldo = valorInicial;
        this.tipo = tipo;
    }
    
    public boolean depositar(double valor){
        //No método depositar por questões de segurança, 
        //não deve permitir depósitos superiores a R$ 1.000,00 caso a conta seja do tipo “Corrente”.
        if(valor > 0){
            if(tipo.toLowerCase().equals("corrente") && valor <= 1000 || tipo.toLowerCase().equals("poupança")){
                    saldo += valor;
                    return true;
            }else 
                return false;
        }else
            return false;
    }
    
    public boolean sacar(double valor){
        //O método sacar não deve permitir saques superiores ao saldo total da conta.
        if(valor <= saldo){
            saldo -= valor;
            return true;
        } else
            return false;
    }
    
    public boolean transferir(double valor, Conta contaDestino){
        // método transferir, pode realizar transferência da conta corrente para a conta poupança, 
        //mas o contrario não é permitido, também não deve permitir que o saldo da conta fique negativo.
        if(valor <= saldo){
            if(tipo.toLowerCase().equals("poupança") && contaDestino.tipo.toLowerCase().equals("corrente"))
                return false;
            else{
                saldo -= valor;
                return true;
            }
        } else 
            return false;        
    }
    
}
