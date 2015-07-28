/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrencia;

/**
 *
 * @author T-107
 */
public class PobarThreads {
    
    public static void main(String[] args) {
        //Paso 1 -Creamos el thread
        PrinerThread t1=new PrinerThread();
        SegundoThread t2=new SegundoThread();
        TercerThread t3=new TercerThread();
        //Paso 2 - Lo ponemos en estado inicializado
        t1.start();
        t2.start();
        t3.start();
        //Pasa 3 y 4 vienen dados por el metodo run
        
    }
}
