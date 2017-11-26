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
 * @author Danilo Loschiavo
 */
public class Pessoa {
   
   public String dizerInformacao(String nome){
       //Deve retornar um texto dizendo: “ Meu nome é “ + nome .
       return "Meu nome é " + nome;
   } 
   
   public String dizerInformacao(int idade){
       //Deve retornar um texto dizendo: “ Minha idade é “ + idade .
       return "Minha idade é " + idade;
   }
   
   public String dizerInformacao(double peso, double altura){
       //Deve retornar um texto dizendo: “ Meu peso é “ + peso +  “ e minha altura é “ + altura .
       return "Meu peso é " + peso + " e minha altura é " + altura;
   }
}
