/**
 * Clase MotorDiesel que construye objetos de tipo Motor
 * con características generales como costo y la velocidad que asigna
 * a su objeto de destino
 * @author noeam Agosto 2020
 */
public class MotorDiesel extends Motor {

    /**
     * Metodo constructor por omision que asigna valores predeterminados
     * al motor de esta clase
     */
    public MotorDiesel() {
        setCosto(5);
        setVelocidad(10);
    }

    /**
     * Clase que asigna un costo al motor correspondiente
     * @param costo que se asigna
     */
    @Override
    public void setCosto(int costo) {
        this.costo = costo;
    }

    /**
     * Clase que asigna una velocidad al motor correspondiente
     * @param velocidad que se asigna
     */
    @Override
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    /**
     * Metodo que funciona para describir a nuestro motor
     * incluyendo caracteristicas como costo y velocidad.
     * @return la descripcion
     */
    @Override
    public String toString() {
        return "MotorDiesel{" +
                "costo=" + costo +
                ", velocidad=" + velocidad +
                '}';
    }
}
