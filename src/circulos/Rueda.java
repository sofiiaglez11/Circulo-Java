/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circulos;

/**
 *
 * @author sofiaglez
 */
public class Rueda extends Circulo implements Inflable { // una rueda hereda de círculo
    
    private Float llanta;
    
    // Constructor 
    public Rueda (float radio, float x, float y, float llanta) {
        super(radio, x, y); // se necesita inicializar los parámetros (si no hubiera constructor por defecto de cirulo, daría error)
        this.llanta = llanta;  
    }
    
    
    // redefinir el método area() (overrrite)
    @Override // para indicar que es una sobredefinición 
    public float area () {
        float radioLlanta=this.getRadio()-this.llanta;
        float area = (radioLlanta*radioLlanta*(float)Math.PI);
        
        area = super.area() - area;
        
        return area;
        
        // otra solución sería crear otro círculo interior y restar las áreas
        /*float areaExterior = super.area();
        float radioInterior = (new Circulo(this.radio - this.llanta, this.getX(), this.getY()).area());
        
        return radioExterior-radioInterior;*/
    }
    
    public void inflar (float aire) {
        this.radio+=aire;
    }
    
    // Redefinir cuantosCirculosHay
    
   // @Override -> a los métodos estáticos no se le pone override
    static public int cuantosCirculosHay() { //Metodo de clase
      /* System.out.println("Hay " + Circulo.getNumCirculos() + " circulos" + 
                          " contando las ruedas");
      
       return Circulo.getNumCirculos(); */
      
      // no deja hacer super.cuantosCirculosHay(); -> no hay redefinición de métodos de clase
      Circulo.cuantosCirculosHay();
      System.out.println("Contando las ruedas");
      return Circulo.getNumCirculos();
   }
        
}
