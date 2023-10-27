package circulos;

import java.util.ArrayList;


/**
 *
 * @author sofiaglez
 */
public class Comprador {
    
    private String nombre;
    private ArrayList <Puja> pujas;

    public Comprador(String nombre) {
        this.nombre = nombre;
        this.pujas = new ArrayList <>();
    }
    
    /*
    He añadido este método para probar en el main
    
    public String getNombre()
    {
        return this.nombre;
    }*/
            

    public void pujar (Cuadro cua, int precio ) {
        Puja puja = new Puja (precio, cua, this);
        this.pujas.add(puja);
        cua.addPuja(puja);
    }
    
    public void mejorarPuja (Cuadro cuadro, int cantidad) {
            
        int max=0;
        
        
        for (Puja puja: this.pujas) {   //1.1 y loop
            Cuadro cuadroPuja = puja.getCuadro();   //1.2
            int precioPuja = puja.getPrecio();      //1.3
            
            if (cuadro==cuadroPuja && precioPuja > max) 
                   max=precioPuja;
        }
        
        if (max>0)  //1.4
            this.pujar(cuadro, cantidad+max);
            
    }
}
