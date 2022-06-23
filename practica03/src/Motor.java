/**
 * Clase abstracta Motor que construye objetos de tipo Motor
 * con características generales como costo y la velocidad que asigna
 * a su objeto de destino
 * @author noeam Agosto 2020
 */
public abstract class Motor {
    int costo;
    int velocidad;

    /**
     * Metodo abstracto que asigna un valor de costo al motor
     * @param costo que se asigna
     */
    public abstract void setCosto(int costo);

    /**
     * Metodo abstractoque asigna un valor de velocidad al motor
     * @param velocidad que se asigna
     */
    public abstract void setVelocidad(int velocidad);

    /**
     * Metodo que nos permite conocer el costo del motor
     * @return el costo
     */
    public int getCosto() {
        return costo;
    }

    /**
     * Metodo que nos permite conocer la velocidad que se adquiere
     * al utilizar este tipo de motor
     * @return la velocidad
     */
    public int getVelocidad() {
        return velocidad;
    }
}