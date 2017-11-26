/**
 *
 * @author Danilo Loschiavo
 */
public class Roda {
    private boolean emAndamento;
    
    Roda(){
        emAndamento = false;
    }
    
    public void girar(){
        //Determina que a roda está em movimento.
        emAndamento = true;
    }
    
    public void parar(){
        //Determina que a roda está parada.
        emAndamento = false;
    }
}
