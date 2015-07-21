/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;

import java.io.*;

public class ModeloPersistenciaAnimal {
    
    
    
    public void guardar(Animal animal) throws Exception{
        //paso 1 para crear el archivo donde se guarda el animal
        File file=new File("D:\\animalitos.xxx");
       FileOutputStream fos=new FileOutputStream(file);
       ObjectOutputStream oss=new ObjectOutputStream(fos);
       oss.writeObject(animal);
        System.out.println("Animalito comprimido con exito");
        
    }
    
}
