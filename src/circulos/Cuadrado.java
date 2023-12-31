package circulos;

/**
 *
 * @author sofiaglez
 */
//public class Cuadrado extends Figura{
public class Cuadrado implements Figura {  
        
    static private float LADO_DEFECTO = 1.0f;
    
    private float lado;
    private float x;
    private float y;
    
    public Cuadrado (float lado, float x, float y)
    {
        //super(); // no se pone en la interfaz 
        if (lado >0 )
             this.lado = lado;
        else
            this.lado =LADO_DEFECTO;
       
        this.x = x;
        this.y = y;
    }
    
    public float getLado()
    {
        return this.lado;
    }
    
    public float getX()
    {
        return this.x;
    }
    
    public float getY()
    {
        return this.y;
    }
    
    @Override
    public float perimetro () {
        return this.lado*4;
    }
            
}
