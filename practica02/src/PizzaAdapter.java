/**
 * Clase que extiende de Baguette y que
 * convierte la descripcion de un objeto de tipo Pizza
 * en una descripcion de tipo Baguette
 * @author noeam Agosto 2020
 */
public class PizzaAdapter extends Baguette{
    private Pizza pizza;

    /**
     * Metodo constructor de esta clase
     * @param pizza que se quiere describir como Baguette
     */
    public PizzaAdapter(Pizza pizza) {
        this.pizza = pizza;
    }

    /**
     * Metodo que describe los ingredientes que contiene
     * la Pizza
     * @return la descripcion de una pizza y sus ingredientes
     */
    @Override
    public String getDescripcion() {
        return "Pizza con masa " +pizza.getMasa()+", "+pizza.getCarne()+" y queso "+pizza.getQueso();
    }

    /**
     * Metodo que define el costo de una Pizza
     * @return el precio de la Pizza
     */
    @Override
    public double costo() {
        return pizza.getPrecio();
    }
}
