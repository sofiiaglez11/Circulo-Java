

package circulos;

//quitando public, Circulo tiene solo visibilidad de paquete
// solo la puede usar clases del mismo paquete
// no se puede importar al main

public class Circulo {  //cada círculo tiene asociado un cuadrado ciruclo x->cuadrado, asociación: envolvente
    
   static private int numCirculos = 0;
   static private final float RADIO_DEFECTO = 1.0f;
   
   private float radio;
   private float x;
   private float y;
  
   private Cuadrado envolvente;
   
   /*
   @brief cuenta el núemro de círculos
   @param 
   @return devuelve el número de círculos
   */
   static public int cuantosCirculosHay() { //Metodo de clase
       return Circulo.numCirculos;
   }
   
   //Está mal proque se duplica el código
  /* public Circulo () {
       this.radio = 1;
       this.x = 0;
       this.y = 0;
       Circulo.numCirculos++;
   }*/
   
   /*
   @brief constructor sin parámetros
   */
   public Circulo () {
       this(Circulo.RADIO_DEFECTO,0,0);
   }
   
   
   /*
   @brief constructor con parámetros
   @param radio 
                 x 
                 y 
   */
   public Circulo (float radio, float x, float y) {
       /*iMAL
       f (radio <=0) 
           this.radio=1;
       else
           this.radio=radio;*/
        this.setRadio(radio);
       this.x = x;
       this.y = y;
       this.envolvente = null;
       Circulo.numCirculos++;
   }
   
    public static int getNumCirculos() {
        return Circulo.numCirculos;
    }

    public float getRadio() {
        return this.radio;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }  
            
    public void setRadio (float r) {
        if (r>0)
            this.radio=r;
        else
            //this.radio = 1.0f; el 1 es un numero magico
            this.radio = Circulo.RADIO_DEFECTO;
    }
   
   public void pintar () {
       System.out.println("El circulo tiene radio: " + this.radio + 
                           " y centro: " + this.x + ", " + this.y);
   }
   
   public Punto Norte ()
   {
       return new Punto (this.x, this.y+this.radio);
   }
   
   public void setEnvolvente()
   {
       this.envolvente = new Cuadrado (this.radio*2, this.x, this.y);
   }
   
   
   public void setEnvolvente (Cuadrado c)
   {
        if ((this.x == c.getX()) && (this.y ==this.getY()) && (this.radio*2) == c.getLado())
            this.envolvente = c;
        else
            this.envolvente = new Cuadrado (this.radio*2, this.x, this.y); 
   }
   
 
   
   public Cuadrado getEnvolvente()
   {
       return this.envolvente;
   }
 
}
