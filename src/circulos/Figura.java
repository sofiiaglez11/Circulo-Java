/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circulos;

/**
 *
 * @author sofiaglez
 */

/*

CLase abstracta
public abstract class Figura {
    private int color;
    
    public Figura() {
        this.color=0;
    }
    
    public abstract float perimetro ();
}

*/


public interface Figura {
    // no tiene atributos
    float perimetro(); // en una interfaz todos los métodos son públicos
}
