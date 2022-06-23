/**
 * Clase que representa a una Pizza de manera general
 * con atributos ingredientes como queso, carne, masa y tambien
 * tiene un precio
 * @author noeam Agosto 2020
 */
public class Pizza {
    private String queso;
    private String carne;
    private String masa;
    private int precio;

    /**
     * Metodo constructor de esta clase que genera un objetos pizza con los
     * ingredientes que vengan en los parametros
     * @param masa que tiene la pizza (delgada o gruesa)
     * @param queso que tiene la pizza (manchego o chedar)
     * @param carne que tiene la pizza (pollo, pepperoni o jamon)
     * @param precio que tiene la pizza
     */
    public Pizza(String masa, String queso, String carne, int precio){
        this.queso = queso;
        this.carne = carne;
        this.masa = masa;
        this.precio = precio;
    }

    /**
     * Metodo que regresa el tipo de queso que tiene la Pizza
     * @return el tipo de queso
     */
    public String getQueso() {
        return queso;
    }

    /**
     * Metodo que regresa el tipo de carne que tiene la Pizza
     * @return el tipo de carne
     */
    public String getCarne() {
        return carne;
    }

    /**
     * Metodo que regresa el tipo de masa que tiene la Pizza
     * @return el tipo de masa
     */
    public String getMasa() {
        return masa;
    }

    /**
     * Metodo que regresa el precio que tiene la Pizza
     * @return el precio
     */
    public int getPrecio() {
        return precio;
    }
}
