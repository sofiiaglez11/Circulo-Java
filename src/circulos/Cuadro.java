package circulos;

import java.util.ArrayList;

/**
 * @author sofiaglez
 */
public class Cuadro {
    
    private String titulo;
    ArrayList  <Circulo> circulos;
    ArrayList <Puja> pujas;
    
    public Cuadro (String titulo)
    {
        this.titulo = titulo;
        this.circulos = new ArrayList <> ();    //inicializar el array de circulos
        this.pujas = new ArrayList <> ();   
        
      
    }
      
        public void addCirculo (float radio, float x, float y)
        {
            Circulo cir = new Circulo (radio, x, y);
            this.circulos.add(cir);
        }
        
       void addPuja (Puja puja) //visibilidad de paquete para no añadir desde el main
        {
            this.pujas.add(puja);
        }
       
       public Comprador ganadorSubasta (){
           int mayor_puja = 0;
           int mayor_precio = 0;
           int precio_actual;
           
           for (int i=0 ;i<this.pujas.size();i++) {
               precio_actual = this.pujas.get(i).getPrecio();
               if (precio_actual>mayor_precio) {
                  mayor_puja = i;
                  mayor_precio = precio_actual;
               } 
           }
                  
           
           return pujas.get(mayor_puja).getComprador();
       }
       
       public Punto calcularNorte () {
           
        Punto<Float> norte = new Punto (0,Float.NEGATIVE_INFINITY); //1

        for (Circulo circulo: this.circulos) {
            Punto <Float>nor_circulo = circulo.norte();
            float yCir=nor_circulo.getX();
            float xCir=nor_circulo.getY();

            float yNorte=norte.getY();

            if (yNorte<yCir) {
              norte.setX(xCir);
              norte.setY(yCir);
            }
        }
        return norte;
       }
      
    
      }
