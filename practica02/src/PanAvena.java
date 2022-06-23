/**
 * Clase que extiende de Baguette y que
 * representa el tipo de Pan que puede un Baguette
 * @author noeam Agosto 2020
 */
public class PanAvena extends Baguette{

    /**
     * Metodo constructor de esta clase
     */
    public PanAvena(){
        descripcion = "Pan de Avena $23";
    }

    /**
     * Metodo para definir el costo del pan
     * @return el costo del pan
     */
    @Override
    public double costo() {
        return 23; //El pan de avena cuesta 23 pesos
    }
}
