/**
 * Clase que extiende de Baguette y que
 * representa el tipo de Pan que puede un Baguette
 * @author noeam Agosto 2020
 */
public class PanParmesano extends Baguette{

    /**
     * Metodo constructor de esta clase
     */
    public PanParmesano(){
        descripcion = "Pan Parmesano $22";
    }

    /**
     * Metodo para definir el costo del pan
     * @return el costo del pan
     */
    @Override
    public double costo() {
        return 22; //El pan parmesano cuesta 22 pesos
    }
}
