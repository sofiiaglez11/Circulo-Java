package circulos;

/**
 *
 * @author sofiaglez
 */

// Comparable es un interfaz que ya existe en Java

public class Punto <T extends Comparable> { 
//public class Punto <T> {
   
    private T x;
    private T y;

    public Punto(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public T getY() {
        return y;
    }

    public void setX(T x) {
        this.x = x;
    }

    public void setY(T y) {
        this.y = y;
    }
    
    
    
        
}
