/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;

public class Usuario {
   private String nombre;
    private int edad;
    
    public void setNombre(String x){
        this.nombre=nombre;
    }
    
    public void setEdad (int edad){
        this.edad=edad;
    }
    
    public  String getNombre(){
            return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
}
