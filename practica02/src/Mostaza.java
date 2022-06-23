/**
 * Clase que extiende a IngredienteDecorador y que
 * representa la funcion de ser Mostaza
 * @author noeam Agosto 2020
 */
public class Mostaza extends IngredienteDecorador{
    Baguette baguette;

    /**
     * Metodo constructor de esta clase
     * @param baguette al que se le va a agregar el ingrediente
     */
    public Mostaza(Baguette baguette) {
        this.baguette = baguette;
    }

    /**
     * Metodo que genera la descripcion agregando el ingrediente que representa esta clase
     * @return la cadena que describe los ingredientes del baguette
     */
    @Override
    public String getDescripcion() {
        return baguette.getDescripcion() + ", Mostaza $1";
    }

    /**
     * Metodo que agrega el costo del ingrediente de esta clase
     * al costo inicial del Baguette
     * @return el costo del baguette
     */
    @Override
    public double costo() {
        return baguette.costo() + 1;
    }
}
