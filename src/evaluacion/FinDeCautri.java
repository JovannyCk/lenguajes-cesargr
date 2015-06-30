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
public class FinDeCautri {
    
    public static void main(String[] args) throws Exception{
       //CReamo un objeto de tipo ExamenParcial
        
        ExamenParcial eParcial=new ExamenParcial();
                      eParcial.setCalificacion(10);
                      eParcial.setPorcentaje(0.4f);
                      
        ExamenFinal eFinal=new ExamenFinal();
                    eFinal.setCalificacion(7);
                    eFinal.setPorcentaje(.6f);
        //CReamos un modelo
        ModeloEvaluacion modelo=new ModeloEvaluacion();
        
        System.out.println(modelo.evaluar(eParcial, eFinal));
       
    }
    
}
