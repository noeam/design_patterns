/**
 * Clase abstracta Llantas que construye objetos de tipo llanta
 * con características generales como costo y la velocidad que asigna
 * a su objeto de destino
 * @author noeam Agosto 2020
 */
public abstract class Llantas {
    int costo;
    int velocidad;

    /**
     * Metodo abstracto que asigna un valor de costo a la llanta
     * @param costo que se asigna
     */
    public abstract void setCosto(int costo);

    /**
     * Metodo abstractoque asigna un valor de velocidad a la llanta
     * @param velocidad que se asigna
     */
    public abstract void setVelocidad(int velocidad);

    /**
     * Metodo que nos permite conocer el costo de las llantas
     * @return el costo
     */
    public int getCosto() {
        return costo;
    }

    /**
     * Metodo que nos permite conocer la velocidad que se adquiere
     * al utilizar este tipo de llantas
     * @return la velocidad
     */
    public int getVelocidad() {
        return velocidad;
    }
}
