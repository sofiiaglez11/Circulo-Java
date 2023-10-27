
import circulos.Circulo; // se incluye solo la clase que neesito
import circulos.Cuadrado;
import circulos.Cuadro;
import circulos.Comprador;

public class Main {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
               
        Circulo c = new Circulo();
        
        
        System.out.println( "Hay " + Circulo.cuantosCirculosHay() + " círculos");
        //System.out.println( "Hay " + circulos.Circulo.cuantosCirculosHay() + " círculos");  -> si no se hace el import
        
        Circulo c1 = new Circulo(1,2,-3); //new devuelve un puntero
                                   //en Java todo son punteros
        c1.pintar();
        System.out.println( "Hay " + Circulo.cuantosCirculosHay() + " círculos");
        
         Circulo c2 = new Circulo(1,2,-3);
         c2.pintar();
         
         //c1 y c2 tienen el mismo estado (los mismos valores)
         // no tienen la misma identidad porque no son el mismo objeto -> distinta pos d memoria
         
         Circulo c3 = c2; //estan en la misma pos d memoria -> son iguales
         
         System.out.println( "El radio del círculo 1 es " + c1.getRadio());
         c1.setRadio(-3.0f);
         System.out.println( "El radio del círculo 1 es " + c1.getRadio());
    
            
         //setter en constructor
         Circulo c5 = new Circulo(-5, 0, 0);
         c5.pintar();
        
         c1=c2;
         c2.pintar();
         c1.setRadio(7);
         c2.pintar();
     
         //prueba de dependencia
         circulos.Punto n2 = c2.Norte();
         c2.setEnvolvente();
         c2.getEnvolvente();
         
         //prueba de asociacion
         Circulo c6 = new Circulo (1,0,0);
         Cuadrado cua1 = new Cuadrado (2, 0,0);
         
         // prueba de composición
         Cuadro muchos_circulos = new Cuadro("Muchos Circulos");
         muchos_circulos.addCirculo(4, 0, 0);
         
         // prueba de la clase de asociaion
         Comprador yo = new Comprador ("yo");
         yo.pujar(muchos_circulos, 100);
         Comprador comp1 = new Comprador ("comp1");
         comp1.pujar(muchos_circulos, 200);
         muchos_circulos.ganadorSubasta();
         
         yo.mejorarPuja(muchos_circulos, 150);
         muchos_circulos.ganadorSubasta();
         
         
         // prueba de la clase de
         
         muchos_circulos.addCirculo(5,0,0);
         muchos_circulos.addCirculo(3,4,4);
         muchos_circulos.addCirculo(2,-3,-3);
         
         muchos_circulos.calcularNorte();
         
    }
    
}
