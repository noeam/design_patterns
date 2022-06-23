/**
 * Clase Abstracta de un ingrediente que
 * se le puede agregar a un cierto Baguette
 * @author noeam Agosto 2020
 */
public abstract class IngredienteDecorador extends Baguette{

    /**
     * Metodo abtracto que describe como se conforma el Baguette
     * despues de elegir los ingredientes.
     */
    public abstract String getDescripcion();
}
