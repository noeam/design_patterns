/**
 * Clase CarroceriaDeportiva que construye objetos de tipo Carroceria
 * con características generales como costo y la defensa que asigna
 * a su objeto de destino
 * @author noeam Agosto 2020
 */
public class CarroceriaDeportiva extends Carroceria{

    /**
     * Metodo constructor por omision que asigna valores predeterminados
     * a la carroceria de esta clase
     */
    public CarroceriaDeportiva() {
        setCosto(15);
        setDefensa(30);
    }

    /**
     * Clase que asigna un costo a la carroceria correspondiente
     * @param costo
     */
    @Override
    public void setCosto(int costo) {
        this.costo = costo;
    }

    /**
     * Clase que asigna un puntaje de defensa
     * a la carroceria correspondiente
     * @param defensa
     */
    @Override
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    /**
     * Metodo que funciona para describir a nuestra carroceria
     * incluyendo caracteristicas como costo y defensa.
     * @return la descripcion
     */
    @Override
    public String toString() {
        return "CarroceriaDeportiva{" +
                "costo=" + costo +
                ", defensa=" + defensa +
                '}';
    }
}
