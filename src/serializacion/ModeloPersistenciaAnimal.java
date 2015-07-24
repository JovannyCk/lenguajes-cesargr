/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;

import java.io.*;

public class ModeloPersistenciaAnimal {
    
    String ruta="D:\\animalitos.xxx";
    
    public void guardar(Animal animal) throws Exception{
        //paso 1 para crear el archivo donde se guarda el animal
        File file=new File(ruta);
        if(file.exists()){
            
        }
       FileOutputStream fos=new FileOutputStream(file);
       ObjectOutputStream oss=new ObjectOutputStream(fos);
       oss.writeObject(animal);
        System.out.println("Animalito comprimido con exito");
        
    }
    
    public Animal buscarTodos() throws Exception{
        Animal a=new Animal();
        File f=new File(ruta);
        FileInputStream ois= new FileInputStream (f);
        ObjectInputStream ois=new ObjectInputStream(fos);
            a=(Animal) ois.readObject();
            return a;
        
        
    }
    
}
