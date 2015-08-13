/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.util.Comparator;
import serializacion.Animal;
import serializacion.ModeloPersistenciaAnimal;


public class Zoologico {
    
    public static void main(String[] args)throws Exception{
        ModeloPersistenciaAnimal m=new ModeloPersistenciaAnimal();
           Animal a=new Animal();
                  a.setNombre("Cuyo");
                  a.setCarnivoro(false);
                  m.guardar(a); 
        
    }

    
    
    
    
}
