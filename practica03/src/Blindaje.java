/**
 * Clase abstracta Blindaje que construye objetos de tipo Blindaje
 * con características generales como costo y la defensa que asigna
 * a su objeto de destino
 * @author noeam Agosto 2020
 */
public abstract class Blindaje {
    int costo;
    int defensa;

    /**
     * Metodo abstracto que asigna un valor de costo al blindaje
     * @param costo que se asigna
     */
    public abstract void setCosto(int costo);

    /**
     * Metodo abstractoque asigna un valor de defensa al blindaje
     * @param defensa que se asigna
     */
    public abstract void setDefensa(int defensa);

    /**
     * Metodo que nos permite conocer el costo del blindaje
     * @return el costo
     */
    public int getCosto() {
        return costo;
    }

    /**
     * Metodo que nos permite conocer la defensa que se adquiere
     * al utilizar este tipo de blindaje
     * @return la defensa
     */
    public int getDefensa() {
        return defensa;
    }
}
