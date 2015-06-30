/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion;

/**
 *
 * @author T-107
 */
public class ModeloEvaluacion {
    
    public float evaluar(ExamenParcial cParcial, ExamenFinal cFinal)throws PorcentajesExcepcion{
        //Para la excepcion pregunta por los porcentajes             Poner throws para la excepcion
        float pParcial=cParcial.getPorcentaje();
        float pFianl=cFinal.getPorcentaje();
        //Si es mayor a 1 lanzar excepcion
        if((pParcial+pFianl)!=1.0f) throw new PorcentajesExcepcion();
        
        float calificacionFinal=cParcial.getCalificacion()*cParcial.getPorcentaje()+ 
                cFinal.getCalificacion()*cFinal.getPorcentaje();
               
        return calificacionFinal;
    }
    
}
