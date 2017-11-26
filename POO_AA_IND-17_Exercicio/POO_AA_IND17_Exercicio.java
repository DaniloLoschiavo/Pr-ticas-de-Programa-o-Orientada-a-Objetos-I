/**
 * Crie duas contas, uma do tipo “Corrente“ e outra do tipo “Poupança” com um saldo inicial qualquer.
 * Tente depositar R$ 1.500,00 reais na conta corrente.
 * Tente depositar R$ 1.500,00 reais na conta poupança.
 * Deposite R$ 98,52 na conta poupança.
 * Tente sacar R$ 100,00 da poupança.
 * Transfira R$ 1.800,00 da corrente para a conta poupança.
 * Transfira R$ 700,00 da poupança para a conta corrente.
 * Saque R$ 1.000,00 da poupança.
 * Saque R$ 1.000,00 da corrente.
 * 
 * @author Danilo Loschiavo
 */
public class POO_AA_IND17_Exercicio {

    public static void main(String[] args) {
        //Crie duas contas, uma do tipo “Corrente“ e outra do tipo “Poupança” com um saldo inicial qualquer.
        Conta contaCorrente = new Conta(0.10);
        Conta contaPoupanca = new Conta(10.1, "Poupança");
        //Tente depositar R$ 1.500,00 reais na conta corrente.
        System.out.println("Depositar R$1.500,00 em conta corrente: "+(contaCorrente.depositar(1500) ? "OKÁ!" : "deu ruim! Não deposita mais de mil para conta corrente!"));
        //Tente depositar R$ 1.500,00 reais na conta poupança.
        System.out.println("Depositar R$1.500,00 em conta poupança: "+(contaPoupanca.depositar(1500) ? "OKÁ!" : "deu ruim!"));
        //Deposite R$ 98,52 na conta poupança.
        System.out.println("Depositar R$98,52 em conta poupança: "+(contaPoupanca.depositar(98.52) ? "OKÁ!" : "deu ruim!"));
        //Tente sacar R$ 100,00 da poupança.
        System.out.println("Sacar R$100,00 da conta poupança: "+(contaPoupanca.sacar(100) ? "OKÁ!" : "deu ruim!"));
        //Transfira R$ 1.800,00 da corrente para a conta poupança.
        System.out.println("Transferir R$1.800,00 da conta corrente para conta poupança: "+
                (contaCorrente.transferir(1800, contaPoupanca) ? "OKÁ!" : "deu ruim! Conta corrente sem saldo"));
        //Transfira R$ 700,00 da poupança para a conta corrente.
        System.out.println("Transferir R$700,00 da conta poupança para conta corrente: "+
                (contaPoupanca.transferir(700, contaCorrente) ? "OKÁ!" : "deu ruim! poupança não transfere para corrente!"));
        //Saque R$ 1.000,00 da poupança.
        System.out.println("Sacar R$1.000,00 da conta poupança: "+(contaPoupanca.sacar(1000) ? "OKÁ!" : "deu ruim!"));
        //Saque R$ 1.000,00 da corrente.
        System.out.println("Sacar R$1.000,00 da conta corrente: "+(contaCorrente.sacar(1000) ? "OKÁ!" : "deu ruim! Sem saldo"));
    }
        
}
