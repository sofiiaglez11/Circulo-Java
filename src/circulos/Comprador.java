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
    
    
            
}
