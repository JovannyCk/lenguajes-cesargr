/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioA;


class bebida {
    
    private String tipo;
    
    private String[ ] bebidas;
    
    public String [] obtenerRecomendaciones(){
        if (tipo.equals("alcoholicas")){
        String []alcohol={"corona","victoria","sol","indio","heineken"};
                return alcohol;
        } else{
            String [] sinalcohol={"coca-cola","pepsi","redbull","agua","jugo"};
                    return sinalcohol;
        }
                
    
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String[] getBebidas() {
        return bebidas;
    }

    public void setBebidas(String[] bebidas) {
        this.bebidas = bebidas;
    }
}

