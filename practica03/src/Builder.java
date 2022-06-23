/**
 * Clase Builder que es la clase que conecta y hace flexible la construccion de objetos.
 * @author noeam Agosto 2020
 */
public abstract class Builder {
    protected Llantas llantas;
    protected Motor motor;
    protected Carroceria carroceria;
    protected Blindaje blindaje;
    protected Arma arma;

    /**
     * Clase que se encarga de construir objetos de tipo Auto
     * una vez que el Builder esté completo.
     * @return un objeto de tipo Auto
     */
    public abstract Auto build();

    /**
     * Clase que se encarga de asignar un estilo de Llantas al
     * objeto Builder
     * @param llantas que se asignan
     */
    public abstract void setLlantas(Llantas llantas);

    /**
     * Clase que se encarga de asignar un estilo de Motor al
     * objeto Builder
     * @param motor que se asigna
     */
    public abstract void setMotor(Motor motor);

    /**
     * Clase que se encarga de asignar un estilo de Carroceria al
     * objeto Builder
     * @param carroceria que se asigna
     */
    public abstract void setCarroceria(Carroceria carroceria);

    /**
     * Clase que se encarga de asignar un estilo de Blindaje al
     * objeto Builder
     * @param blindaje que se asigna
     */
    public abstract void setBlindaje(Blindaje blindaje);

    /**
     * Clase que se encarga de asignar un estilo de Arma al
     * objeto Builder
     * @param arma que se asigna
     */
    public abstract void setArma(Arma arma);
}
