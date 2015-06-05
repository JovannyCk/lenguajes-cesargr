
package Arreglos;

/**
 * @jovannyCK
 */
public class arreglos {

    
    public static void main(String[] args) {
        
        int x []={1,45,-12,7};
        
        int y[]=new int[3];
        y[0]=34;
        y[1]=12;
        y[2]=45;
        
        int z[]=new int []{3,-12,9};
        String hola="hola";
       /** 
     *   for(int i=0;i<x.length;i++){
     *       System.out.println("Este elemnto tiene un valor de:"+x[i]);
     *   }
        
     *   for(int c:x)
     *       System.out.println("Este elemento tiene una valor de:"+c);
            */ 
    byte []algo=hola.getBytes();
    StringBuilder builder=new StringBuilder();
   for(byte valor:algo){
       builder.append((char)valor);
   }
   etiquetax.setText(builder.toString());
   //etiqueta x no existe     
   
        
    }
    
}
