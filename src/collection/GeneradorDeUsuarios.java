/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.util.ArrayList;
import java.util.List;


public class GeneradorDeUsuarios {
    
    private List<Usuario> usuarios;
    
    public GeneradorDeUsuarios (){
        
        Usuario u1=new Usuario("Cesar", 23, "ck@stark.com");
        Usuario u2=new Usuario("Pau", 22, "pau@gmail.com");
        Usuario u3=new Usuario("Raul", 24, "raul@gmail.com");
        
        usuarios=new ArrayList<Usuario>(); 
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    

    
}
