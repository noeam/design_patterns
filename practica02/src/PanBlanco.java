/**
 * Clase que extiende de Baguette y que
 * representa el tipo de Pan que puede un Baguette
 * @author noeam Agosto 2020
 */
public class PanBlanco extends Baguette{

    /**
     * Metodo constructor de esta clase
     */
    public PanBlanco(){
        descripcion = "Pan Blanco $20";
    }

    /**
     * Metodo para definir el costo del pan
     * @return el costo del pan
     */
    @Override
    public double costo() {
        return 20; //El pan blanco cuesta 20 pesos
    }
}
