/**
 * Clase ArmaMetralleta que construye objetos de tipo Arma
 * con características generales como costo y el ataque que asigna
 * a su objeto de destino
 * @author noeam Agosto 2020
 */
public class ArmaMetralleta extends Arma{

    /**
     * Constructor por omision que asigna directamente los valores de costo
     * y ataque al objeto
     */
    public ArmaMetralleta() {
        setCosto(25);
        setAtaque(50);
    }

    /**
     * Clase que asigna un costo a la arma correspondiente
     * @param costo que se asigna
     */
    @Override
    public void setCosto(int costo) {
        this.costo = costo;
    }

    /**
     * Clase que asigna un puntaje de ataque
     * a la arma correspondiente
     * @param ataque que se asigna
     */
    @Override
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    /**
     * Metodo que funciona para describir a nuestra arma
     * incluyendo caracteristicas como costo y ataque.
     * @return la descripcion
     */
    @Override
    public String toString() {
        return "ArmaMetralleta{" +
                "costo=" + costo +
                ", ataque=" + ataque +
                '}';
    }
}
