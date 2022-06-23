/**
 * Clase que extiende de Baguette y que
 * representa el tipo de Pan que puede un Baguette
 * @author noeam Agosto 2020
 */
public class PanIntegral extends Baguette{

    /**
     * Metodo constructor de esta clase
     */
    public PanIntegral(){
        descripcion = "Pan Integral $21";
    }

    /**
     * Metodo para definir el costo del pan
     * @return el costo del pan
     */
    @Override
    public double costo() {
        return 21; //El pan integral cuesta 21 pesos
    }
}
