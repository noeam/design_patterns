/**
 * Clase Abstracta de un Baguette que tiene como
 * atributos una descripcion.
 * @author noeam Agosto 2020
 */
public abstract class Baguette{
    String descripcion;

    /**
     * Metodo que describe como se conforma el Baguette
     * despues de elegir los ingredientes.
     * @return la descripcion del Baguette y
     *          los ingredientes que contiene
     */
    public String getDescripcion() {
        return "Baguette de " + descripcion;
    }

    /**
     * Metodo abstracto que define el costo de un Baguette
     * dependiendo del tipo de pan y los ingredientes
     * con los que se haya preparado
     */
    public abstract double costo();
}
