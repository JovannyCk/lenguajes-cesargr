/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

/**
 *
 * @author T-107
 */
public class Imc {
    
    float peso;
    float altura;
    
    public Imc (){
        peso=90;
        altura=1.72f;
    }
    
public float calcular(){
    
    float imc=peso/(altura*altura);
    return imc;
}
}
