import java.util.Scanner;

/**
 * Crie uma classe chamada Pessoa sem atributo algum. Para trabalharmos os conceitos de sobrecarga de métodos, crie os seguintes métodos:
 * 
 * public String dizerInformacao(String nome);
 *  - Deve retornar um texto dizendo: “ Meu nome é “ + nome .
 * public String dizerInformacao(int idade);
 *  - Deve retornar um texto dizendo: “ Minha idade é “ + idade .
 * public String dizerInformacao(double peso, double altura);
 *  - Deve retornar um texto dizendo: “ Meu peso é “ + peso +  “ e minha altura é “ + altura .
 * 
 * Munido do retorno de cada um destes métodos, imprima-o em tela.
 * Para praticarmos o uso da classe Scanner, leia estas quatro informações que devem ser inseridas pelo usuário.
 * 
 * @author Danilo Loschiavo
 */
public class POO_PS_IND17_Exec2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Insira seu nome: ");
        String nome = entrada.next();
        System.out.print("Insira sua idade: ");
        int idade = entrada.nextInt();
        System.out.print("Insira seu peso: ");
        double peso = entrada.nextDouble();
        System.out.print("Insira sua altura: ");
        double altura = entrada.nextDouble();
        
        Pessoa pessoa = new Pessoa();
        System.out.println(pessoa.dizerInformacao(nome)+"\n"+
                pessoa.dizerInformacao(idade)+"\n"+
                pessoa.dizerInformacao(peso, altura));
    }
    
}
