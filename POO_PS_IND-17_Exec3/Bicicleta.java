/**
 *
 * @author Danilo Loschiavo
 */
public class Bicicleta {
    public Roda rodaDianteira;
    private Roda rodaTraseira;
    
    Bicicleta(){
        rodaTraseira = rodaDianteira = new Roda();
    }
    
    public void andar(){
        //Faz com que a bicicleta ande;
        rodaTraseira.girar();
    }
    
    public void frear(){
        //Faz com que a bicicleta pare.
        rodaTraseira.parar();
    }
}
