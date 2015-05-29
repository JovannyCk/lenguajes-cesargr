/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

public class Imc {
    
    private float peso;
    private float altura;
    private boolean flaco;
    Imc(int i, float f) {
      
    }
    
    public void setFlaco (boolean flaco){
        this.flaco=flaco;
    }
    
    //public boolean isFlaco]() {
    //return flaco;
    //}
    
    public Imc (float peso)
    {
        this.peso=peso;
    }
    
    public void setAltura(float altura)
    {
        this.altura=altura;
    }
    public Imc (){
      
    }
   
public float calcular(){
    
    float imc=peso/(altura*altura);
    return imc;
}

    boolean getPeso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setPeso(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean isFlaco() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
