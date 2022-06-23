/**
 * Clase Auto utilizada como la clase Director de la implementación
 * del patron de disenio Builder
 * @author noeam Agosto 2020
 */
public class Auto {
    protected Llantas llantas;
    protected Motor motor;
    protected Carroceria carroceria;
    protected Blindaje blindaje;
    protected Arma arma;
    protected int ataque;
    protected int defensa;
    protected int velocidad;
    protected int costo;

    /**
     * Constructor del objeto Auto que recibe como parametro
     * un objeto Builder que se encarga de construir el auto y de
     * asignar los valores obtenidos a nuestro auto
     * @param builder
     */
    public Auto(Builder builder){
        this.llantas = builder.llantas;
        this.motor = builder.motor;
        this.carroceria = builder.carroceria;
        this.blindaje = builder.blindaje;
        this.arma = builder.arma;
        this.ataque = builder.arma.getAtaque();
        this.defensa = builder.blindaje.getDefensa() + builder.carroceria.getDefensa();
        this.velocidad = builder.motor.getVelocidad() + builder.llantas.getVelocidad();
        this.costo = builder.llantas.getCosto()
                +builder.motor.getCosto()
                +builder.carroceria.getCosto()
                +builder.blindaje.getCosto()
                +builder.arma.getCosto();
    }

    /**
     * Metodo que se encarga de describir completamente al objeto Auto mencionando
     * sus atributos y valores correspondientes.
     * @return la descrpción del auto
     */
    public String getDescripcion(){
        return "Haz construido un auto con:"+
                "\nLlantas: " + llantas.toString()
                + "\nMotor: " + motor.toString()
                + "\nCarroceria " + carroceria.toString()
                + "\nBlindaje: " + blindaje.toString()
                + "\nArma: " + arma.toString()
                + "\nAtaque acumulado: " + ataque
                + "\nDefensa acumulada: " + defensa
                + "\nVelocidad acumulada: " + velocidad
                + "\nCosto total: $" + costo;
    }
}
