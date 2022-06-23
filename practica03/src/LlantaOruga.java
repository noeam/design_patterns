/**
 * Clase LlantaOruga que construye objetos de tipo llanta
 * con características generales como costo y la velocidad que asigna
 * a su objeto de destino
 * @author noeam Agosto 2020
 */
public class LlantaOruga extends Llantas{

    /**
     * Metodo constructor por omision que asigna valores predeterminados
     * a las Llantas de esta clase
     */
    public LlantaOruga() {
        setCosto(20);
        setVelocidad(40);
    }

    /**
     * Clase que asigna un costo a las llantas correspondiente
     * @param costo
     */
    @Override
    public void setCosto(int costo) {
        this.costo = costo;
    }

    /**
     * Clase que asigna un puntaje de velocidad
     * a las llantas correspondientes correspondiente
     * @param velocidad
     */
    @Override
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    /**
     * Metodo que funciona para describir a nuestar llantas
     * incluyendo caracteristicas como costo y velocidad.
     * @return la descripcion
     */
    @Override
    public String toString() {
        return "LlantaOrugadeTanque{" +
                "costo=" + costo +
                ", velocidad=" + velocidad +
                '}';
    }
}
