/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

public class InterfazImc {

      public static void main (String Jovannyck[]){
          
          Imc imc=new Imc(90,1.72f);
          imc.setPeso(100);
      
             System.out.println(imc.calcular()); 
             System.out.println(imc.getPeso());

          //primitivos integrales
             
            byte b=2;
            short s=2;
            int i=2;
            long l=2;
            
            b=(byte) s;
            s=b;
            i=(int) l;
            i=s;
            s=(short) i;
            
            float f=2.0F;
            double d=2.0;
            
            boolean valor=false;
            
            Imc otro=new Imc();
            System.out.println(otro.isFlaco());
            
      
}   
}
