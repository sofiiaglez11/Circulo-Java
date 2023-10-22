/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circulos;

/**
 *
 * @author sofiaglez
 */
public class Puja {
    
    private int precio;
    
    private Cuadro cuadro;
    private Comprador comprador;

    public Puja(int precio, Cuadro cuadro, Comprador comprador) {
        this.precio = precio;
        this.cuadro = cuadro;
        this.comprador = comprador;
    }
    
    public int getPrecio()
    {
        return this.precio;
    }
    
    public Comprador getComprador()
    {
        return this.comprador;
    }
    
    
    
}
