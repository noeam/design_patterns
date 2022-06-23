/**
 * Clase abstracta Carroceria que construye objetos de tipo Carroceria
 * con características generales como costo y la defensa que asigna
 * a su objeto de destino
 * @author noeam Agosto 2020
 */
public abstract class Carroceria {
    int costo;
    int defensa;

    /**
     * Metodo abstracto que asigna un valor de costo a la carroceria
     * @param costo que se asigna
     */
    public abstract void setCosto(int costo);

    /**
     * Metodo abstractoque asigna un valor de defensa a la carroceria
     * @param defensa que se asigna
     */
    public abstract void setDefensa(int defensa);

    /**
     * Metodo que nos permite conocer el costo de la carroceria
     * @return el costo
     */
    public int getCosto() {
        return costo;
    }

    /**
     * Metodo que nos permite conocer la defensa que se adquiere
     * al utilizar este tipo de carroceria
     * @return la defensa
     */
    public int getDefensa() {
        return defensa;
    }
}
