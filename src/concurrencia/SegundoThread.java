/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrencia;


public class SegundoThread extends Thread{
    public void run(){
       while(true){
       try{
           Thread.sleep(1000);
       System.out.println("yo soy el segundo THREAD");
       }catch(InterruptedException e){
       }
   }//se cierra el while
   }
    
}
