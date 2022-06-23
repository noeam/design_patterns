/**
 * Clase BlindajeTanque que construye objetos de tipo Blindaje
 * con características generales como costo y la defensa que asigna
 * a su objeto de destino
 * @author noeam Agosto 2020
 */
public class BlindajeTanque extends Blindaje{

    /**
     * Constructor por omision que asigna directamente los valores de costo
     * y defensa al objeto
     */
    public BlindajeTanque() {
        setCosto(15);
        setDefensa(30);
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
        return "BlindajeTanque{" +
                "costo=" + costo +
                ", defensa=" + defensa +
                '}';
    }
}
