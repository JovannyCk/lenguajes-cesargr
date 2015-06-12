/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;


public class Pollo extends Animal implements  ComportamientoRudo{
    
    @Override
    public Srting haceRuido(){
        return "piopioppio";
    }
}
