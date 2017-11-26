/**
 * 1. Crie uma classe chamada Calculadora.
 * 
 *  * public double operacao(double num1, double num2);
 *  - Retorna a soma dos dois números.
 * public double operacao(int num1, double num2);
 *  - Retorna a subtração dos dois números.
 * public double operacao(double num1, int num2);
 *  - Retorna o produto dos dois números.
 * public double operacao(int num1, int num2);
 *  - Retorna o resultado da divisão dos dois números.
 * public double operacao(int num1, short num2);
 *  - Retorna o resto da divisão dos dois números.
 * 
 * Elabore um roteiro de teste para a sua calculadora e observe os resultados.
 * 
 * @author Danilo Loschiavo
 */
public class POO_PS_IND17_Exec1 {
    
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        System.out.println("Soma " + (calc.operacao(0.1, 0.1)== 0.2 ? "OKÁ!" : "deu ruim!"));//Retorna a soma dos dois números.
        System.out.println("Subtração " + (calc.operacao(1, 0.1)== 0.9 ? "OKÁ!" : "deu ruim!"));//Retorna a subtração dos dois números.
        System.out.println("Produto " + (calc.operacao(0.2, 2)== 0.4 ? "OKÁ!" : "deu ruim!"));//Retorna o produto dos dois números.
        System.out.println("Divisão " + (calc.operacao(4, 2)== 2 ? "OKÁ!" : "deu ruim!"));//Retorna o resultado da divisão dos dois números.
        System.out.println("Resto " + (calc.operacao(3, (short)2)== 1 ? "OKÁ!" : "deu ruim!"));//Retorna o resto da divisão dos dois números.
        
    }
    
}
