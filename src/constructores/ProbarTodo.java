/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

import javax.swing.JFrame;

/**
 *
 * @author T-107
 */
public class ProbarTodo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       Test1 objeto1=new Test1(13);
       Test1 objeto2=new Test1();
      
       JFrame ventana=new JFrame("Mi First Windwo" );
              ventana.setSize(400, 150);
              ventana.setVisible(true);
              
    }
    
}
