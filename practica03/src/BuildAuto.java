/**
 * Clase que se encarga de construir Autos utilizando
 * el patron de diseño Builder. Esta clase extiende del Builder.
 * @author noeam Agosto 2020
 */
public class BuildAuto extends Builder{

    /**
     * Constructor por omision de un auto que se considera "Normal"
     */
    public BuildAuto() {
        llantas = new LlantaSimple();
        motor = new MotorDiesel();
        carroceria = new CarroceriaCasual();
        blindaje = new BlindajeSimple();
        arma = new ArmaArpon();
    }

    /**
     * Clase que se encarga de construir objetos de tipo Auto
     * una vez que el Builder esté completo.
     * @return un objeto de tipo Auto
     */
    @Override
    public Auto build() {
        return new Auto(this);
    }

    /**
     * Clase que se encarga de asignar un estilo de Llantas al
     * objeto en este caso la construccion de un auto
     * @param llantas que se asignan
     */
    public void setLlantas(Llantas llantas) {
        this.llantas = llantas;
    }

    /**
     * Clase que se encarga de asignar un estilo de Motor al
     * objeto en este caso la construccion de un auto
     * @param motor que se asigna
     */
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    /**
     * Clase que se encarga de asignar un estilo de Carroceria al
     * objeto en este caso la construccion de un auto
     * @param carroceria que se asigna
     */
    public void setCarroceria(Carroceria carroceria) {
        this.carroceria = carroceria;
    }

    /**
     * Clase que se encarga de asignar un estilo de Blindaje al
     * objeto en este caso la construccion de un auto
     * @param blindaje que se asigna
     */
    public void setBlindaje(Blindaje blindaje) {
        this.blindaje = blindaje;
    }

    /**
     * Clase que se encarga de asignar un estilo de Arma al
     * objeto en este caso la construccion de un auto
     * @param arma que se asigna
     */
    public void setArma(Arma arma) {
        this.arma = arma;
    }

}
