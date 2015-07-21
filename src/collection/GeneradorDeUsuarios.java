/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;


public class GeneradorDeUsuarios {
    
    private List<Usuario> usuarios;
    
    public GeneradorDeUsuarios (){
        
        Usuario u1=new Usuario("Cesar", 23, "ck@stark.com");
        Usuario u2=new Usuario("Pau", 22, "pau@gmail.com");
        Usuario u3=new Usuario("Raul", 24, "raul@gmail.com");
        Usuario u4=new Usuario("Pamcha", 60, "pancha@gmail.com");
        
        usuarios=new ArrayList<Usuario>(); 
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        usuarios.add(u4);
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    public String agregarUsuario(String nombre, int edad, String email){
        Usuario u=new Usuario(nombre, edad, email);
        usuarios.add(u);
        return "Usuario Agregado con Exito";
    }
    
}
