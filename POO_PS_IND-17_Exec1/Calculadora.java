/**
 * Crie uma classe chamada Calculadora. Esta classe deve possuir os seguintes métodos:
 * 
 * public double operacao(double num1, double num2);
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
 * @author Danilo Loschiavo
 */
public class Calculadora {
    
    public double operacao(double num1, double num2){
        //Retorna a soma dos dois números.
        return num1+num2;
    }
    
    public double operacao(int num1, double num2){
        //Retorna a subtração dos dois números.
        return num1-num2;
    }
    
    public double operacao(double num1, int num2){
        //Retorna o produto dos dois números.
        return num1*num2;
    }
    
    public double operacao(int num1, int num2){
        //Retorna o resultado da divisão dos dois números.
        return num1/num2;
    }
    
    public double operacao(int num1, short num2){
        //Retorna o resto da divisão dos dois números.
        return num1%num2;
    }
}
