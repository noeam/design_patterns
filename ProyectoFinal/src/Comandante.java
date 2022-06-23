import java.util.List;
/**
*Clase Comandate. Para crear Soldados comandantes de pelotones
*/
public class Comandante implements Soldado{
    private int id;
    private String nombre;
    private int vida;
    private Movimiento movimiento;
    private Ataque ataque;
    private List<Soldado> soldados; //Peloton del comandante
    private int distanciaEnemigo;
    private Enemigo enemigo; //enemigo a atacar 
    private Soldado especialidad;

    
    /**
    *Constructor. Construye un nuevo comandante
    *@param id el nuevo id del comandante
    *@param nombre el nuevo nombre del comandante
    *@param especialidad la especialidad del comandante (Artillero, caballero o infante)
    *@param soldados el peloton del comandante
    *@param enemigo el enemigo a atacar
    */
    public Comandante(int id, String nombre, Soldado especialidad, List<Soldado> soldados, Enemigo enemigo) {
        this.id = id;
        this.nombre = nombre;
        this.vida = especialidad.getVida();
        this.movimiento = especialidad.getMovimiento();
        this.ataque = especialidad.getAtaque();
        this.especialidad = especialidad;
        this.soldados = soldados;
        this.enemigo = enemigo;
        this.distanciaEnemigo = enemigo.getDistancia();
    }

    /**
     * Metodo que mueve al comandante hacia el enemigo,
     * y manda indicaciones a los soldados de su lista para que tambien se muevan
     */
    @Override
    public void mover() {
        if(distanciaEnemigo > 0){
            distanciaEnemigo -= especialidad.getMovimiento().getMovimiento();
            if (distanciaEnemigo <= 0 ){
                distanciaEnemigo = 0;
                System.out.println("El Comandante "+ id +" ya puede atacar al enemigo");
            }else {
                System.out.println("El Comandante " + id
                        + " esta a "+ distanciaEnemigo + " metros del enemigo");
            }
        } else {
            System.out.println("El Comandante " + id + " ya puede atacar al enemigo");
        }

        for (Soldado integrante : soldados) {
            integrante.mover();
        }

    }

    /**
     * Metodo que manda la indicacion al comandante de que ataque al enemigo,
     * y manda indicaciones a los soldados de su lista para que tambien ataquen
     */
    @Override
    public void atacar() {
        if (vida > 0 & distanciaEnemigo <= 0 & enemigo.getVida()>0) {
            int vidaEnemigo = enemigo.getVida();
            vidaEnemigo -= especialidad.getAtaque().getDanio();
            enemigo.setVida(vidaEnemigo);
            if (especialidad.getAtaque().getDanio() == 50) { //Si el Comandante ataca con un Canion
                vida -= 10;
                System.out.println("La vida del enemigo es " + enemigo.getVida()
                        + "; ataco el Comandante " + id + " y ahora su vida es "
                        + vida);
            } else {
                System.out.println("La vida del enemigo es " + enemigo.getVida()
                        + "; ataco el Comandante " + id);
            }

        } else if (vida <= 0) {
            System.out.println("El Comandante " + id + " ya no puede atacar"
                    + " porque murio hace rato :(");
        }else if(enemigo.getVida() <= 0){
            System.out.println("El Comandante " + id + " ya no puede atacar porque el enemigo ya murio");
        } else {
            System.out.println("El Comandante " + id + " no puede atacar"
                    + " porque esta a " + distanciaEnemigo + " metros del enemigo");
        }

        for (Soldado integrante : soldados) {
            integrante.atacar();
            
        }
    }

    /**
     * Metodo que se reporte el comandante
     * y manda indicaciones a los soldados de su lista para que tambien se reporten
     */
    @Override
    public void reportar() {
        System.out.println("--------------------PRESENTACION DEL PELOTON " + id
                +"-------------------------");
        System.out.println("Soy el Comandante " + id
                + ", me llamo " + nombre
                + ",  mi especialidad es " + especialidad.getEspecialidad()
                + ", mis puntos de vida son " + vida
                + " y me encuentro a " + distanciaEnemigo + " metros del enemigo");
        for(Soldado integrante : soldados){
            integrante.reportar();
        }
        System.out.println("----------------------FIN DE LA PRESENTACION"
                +"---------------------------");
    }

    /**
     * Metodo para saber a que enemigo ataca el comandante
     * @return el enemigo al que ataca
     */
    @Override
    public Enemigo getEnemigo(){
        return enemigo;
    }

    /**
     * Metodo para conocer la especialidad del comandante
     * @return la especialidad del comandante
     */
    @Override
    public String getEspecialidad(){
        return especialidad.getEspecialidad();
    }

    /**
     * Metodo para conocer la vida del comandante
     * @return la vida del comandante
     */
    @Override
    public int getVida(){
        return especialidad.getVida();
    }

    /**
     * Metodo para saber que tipo de transporte utiliza el comandante
     * @return el transporte del comandante
     */
    @Override
    public Movimiento getMovimiento(){
        return especialidad.getMovimiento();
    }

    /**
     * Metodo para conocer el arma con el que ataca el comandante
     * @return el arma del comandante
     */
    @Override
    public Ataque getAtaque(){
        return especialidad.getAtaque();
    }

}
