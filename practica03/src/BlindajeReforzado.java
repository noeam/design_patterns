/**
 * Clase BlindajeReforzado que construye objetos de tipo Blindaje
 * con características generales como costo y la defensa que asigna
 * a su objeto de destino
 * @author noeam Agosto 2020
 */
public class BlindajeReforzado extends Blindaje{

    /**
     * Metodo constructor por omision que asigna valores predeterminados
     * al blindaje de esta clase
     */
    public BlindajeReforzado() {
        setCosto(10);
        setDefensa(20);
    }

    /**
     * Clase que asigna un costo al blindaje correspondiente
     * @param costo
     */
    @Override
    public void setCosto(int costo) {
        this.costo = costo;
    }

    /**
     * Clase que asigna un puntaje de defensa
     * al blindaje correspondiente
     * @param defensa
     */
    @Override
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    /**
     * Metodo que funciona para describir a nuestro blindaje
     * incluyendo caracteristicas como costo y defensa.
     * @return la descripcion
     */
    @Override
    public String toString() {
        return "BlindajeReforzado{" +
                "costo=" + costo +
                ", defensa=" + defensa +
                '}';
    }
}
