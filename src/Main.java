
import circulos.Circulo; // se incluye solo la clase que neesito
import circulos.Cuadrado;
import circulos.Cuadro;
import circulos.Comprador;
import circulos.Circulo;
import circulos.Rueda;
import circulos.Figura;
import circulos.Punto;

public class Main {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
               
      /* circulos.Circulo c = new circulos.Circulo();
       
        
        System.out.println( "Hay " + Circulo.cuantosCirculosHay() + " círculos");
        //System.out.println( "Hay " + circulos.Circulo.cuantosCirculosHay() + " círculos"); // -> si no se hace el import
        
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
         circulos.Punto n2 = c2.norte();
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
      
      
      // Prueba de herencia
      //Rueda rueda = new Rueda (5.0f,-1.0f,1.0f,3.0f);
      
     // Float area = rueda.area(); 
      
      
      // asignaciones polimórficas -> típicas preguntas de examen
      Circulo circulo2 = new Circulo ();
      Rueda rueda2 = new Rueda (5, 0,0,3);
      
      //Rueda rueda3 = circulo2; un círculo no es una rueda
      Circulo circulo3 = rueda2; // tipo estático de circulo3 -> Circulo
                                 // tipo dinámico de circulo3 -> Rueda
           
      circulo3.area();      // Se ejecuta el area del tipo dinámico (área)
      circulo3=circulo2;    // ha cambiado su tipo dinámico
      circulo3.area();      // se ejecuta el área de Círculo
      
      
      circulo3=rueda2;
      //circulo3.inflar(3);     // no compila porque una variable solo puede 
                                //acceder a los métodos de su tipo estático
      ((Rueda)circulo3).inflar(3);
      
      
     // ((Rueda) ( new Circulo(5,0,0))).inflar(2);  // no se puede convertir un círculo en una
                                                    // rueda, aunque no de error de compilación
        
        // Clase abstracta
       // Figura fig = new Figura (); // no se puede instanciar una clase abstracta   
       // una interfaz se usa igual que un aclase abstracta
        Figura fig2;
        
        Circulo c1 = new Circulo();
        Cuadrado envolvente = c1.getEnvolvente();
        
        fig2 = c1;
        fig2.perimetro();
        fig2 = new Cuadrado (1,1,1);
//        fig2.perimetro();    
        

        // prueba de herencia de clases
        Circulo.cuantosCirculosHay();
        Rueda.cuantosCirculosHay();
        
        // prueba de ligadura dinámica y metodos de clase
        Circulo cc = new Rueda (5,1,1,3);
        
        // Java lo permite, pero no es correcto
        // Se está accediendo a un método de clase desde una instancia
        // no funciona la ligadura dinámica para la herencia de clases 
        // el método es static, no funciona nada dinámico
        // entra el método del Circulo, no en el de la Rueda
        cc.cuantosCirculosHay();
        
        ((Rueda)cc).inflar(3);
        
        
        // prueba de clases parametrizables
        //Punto puntoBooleano = new Punto (true, 5.0f);
        //Punto <Boolean>puntoBooleano = new Punto (true, 5.0f);
        //Punto <Boolean>puntoBooleano = new Punto <Boolean> (true, 5.0f);
        // con extends comparable da error (Circulo no es comparable)
        // se soluciona implementando el método comparable
        Punto puntoBooleano = new Punto (new Circulo(), new Circulo()); 
        */
        // Prueba de copia
        // 
        Circulo uno = new Circulo (5,0,0);
        Circulo dos = uno;
        // cuando modificamos el radio de 'dos' se cambia también el de 'uno'
        dos.setRadio(7);
        
        
        // copia profunda (una vez se ha hecho copia profunda también del cuadrado)
        // copia defensiva -> evitar que al modificar un objeto d¡se modifique 
        // también otro
        Cuadrado env = new Cuadrado (14, 0,0);
        uno.setEnvolvente(env);
        Circulo copia = new Circulo(uno);   
        copia.setRadio(8);
        
    }
    
}
