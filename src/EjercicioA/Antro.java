package EjercicioA;


public class Antro {

   
    public static void main(String[] args) {
        Direccion d1=new Direccion(55130,"Ecatepec");
        Usuario u=new Usuario("Juan",42,"jcampos@gmail.com",d1);
        //Usuario u=new Usuario("Juan",42,"jcampos@gmail.com", new Direccion(55130Ecatepec));
        
        System.out.println(u.getDireccion().getMunicipio());
                          //
    }
    
}
