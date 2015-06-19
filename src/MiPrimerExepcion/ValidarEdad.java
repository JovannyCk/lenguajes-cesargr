
package MiPrimerExepcion;


public class ValidarEdad {
    
    public static void validar(int edad)throws MenorEdadException {
        
        if(edad<18) throw new MenorEdadException();
    }
    
}
