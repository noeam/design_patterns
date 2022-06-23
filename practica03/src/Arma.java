/**
 * Clase abstracta Arma que construye objetos de tipo Arma
 * con características generales como costo y el ataque que asigna
 * a su objeto de destino
 * @author noeam Agosto 2020
 */
public abstract class Arma {
    int costo;
    int ataque;

    /**
     * Metodo abstracto que asigna un valor de costo al arma
     * @param costo que se asigna
     */
    public abstract void setCosto(int costo);

    /**
     * Metodo abstractoque asigna un valor de ataque al arma
     * @param ataque que se asigna
     */
    public abstract void setAtaque(int ataque);

    /**
     * Metodo que nos permite conocer el costo del arma
     * @return el costo
     */
    public int getCosto() {
        return costo;
    }

    /**
     * Metodo que nos permite conocer el ataque que se adquiere
     * al utilizar este tipo de arma
     * @return la defensa
     */
    public int getAtaque() {
        return ataque;
    }
}
