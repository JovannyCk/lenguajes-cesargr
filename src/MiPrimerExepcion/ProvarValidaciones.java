/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiPrimerExepcion;


public class ProvarValidaciones {

    
    public static void main(String[] args) throws MenorEdadException {
        
        int edad=21;
        System.out.println("Vamos a validar tu edad");
        try{
        ValidarEdad.validar(edad);
    } catch (Exception ex){
            System.out.println(ex.getMessage());
    }// catch (NumberFormatException ex){
            System.out.println("Metiste letras y no numero tonto");
    }
    }

