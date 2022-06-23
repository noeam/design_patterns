/** 
*Clase Soldado infanteria. 
*Representa a un Soldado del tipo Infante.
*/

public class SoldadoInfanteria implements Soldado{
    private int id;
    private String nombre;
    private int vida = 50; // vida por default de los infantes
    private int distanciaEnemigo;
    private Movimiento movimiento = new PieTransporte();
    private Ataque ataque = new Pistola();
    private Reporte reporte = new ReporteInfanteria();
    private Enemigo enemigo;

    /**
    *Constructor simple solo para acceso a metodos
    */
    public SoldadoInfanteria(){}

    /**
    *Constructor de un nuevo Soldado de infanteria
    *@param id el id del soldado
    *@param nombre el nombre del soldado
    *@param enemigo el enemigo que el soldado va a enfrentar
    */
    public SoldadoInfanteria(int id, String nombre, Enemigo enemigo){
        this.id = id;
        this.nombre = nombre;
        this.enemigo = enemigo;
        this.distanciaEnemigo = enemigo.getDistancia();
    }

    /**
     *Mueve al soldado para que pueda acercarse
     *al enemigo
     */
    @Override
    public void mover() {
        if(distanciaEnemigo > 0){ //Si el soldado esta lejos del enemigo
            distanciaEnemigo -= movimiento.getMovimiento();
            if (distanciaEnemigo <= 0){ //Si el soldado se pasa a distancia negativa
                distanciaEnemigo = 0;
                System.out.println("El Infante " + id + " ya puede atacar al enemigo");
            }else {//Si el Soldado todavia esta lejos del enemigo
                System.out.println("El Infante " + id
                        + " esta a "+ distanciaEnemigo + " metros del enemigo");
            }
        } else { //Si el soldado ya esta a lado del enemigo
            System.out.println("El Infante " + id + " ya puede atacar al enemigo");
        }

    }

    /**
     *El soldado ataca al enemigo restándole
     *puntos de vida.
     */
    @Override
    public void atacar() {
        if(vida > 0 & distanciaEnemigo <= 0 & enemigo.getVida()>0){
            int vidaEnemigo = enemigo.getVida();
            vidaEnemigo -= ataque.getDanio();
            enemigo.setVida(vidaEnemigo);
            System.out.println("La vida del enemigo es " + enemigo.getVida()
                    + "; ataco el Infante " + id);
        }else if(vida <= 0){
            System.out.println("El Infante " + id + " ya no puede atacar"
                    + " porque murio hace rato :(");
        }else if(enemigo.getVida() <= 0){
            System.out.println("El Infante " + id + " ya no puede atacar porque el enemigo ya murio");
        } else {
            System.out.println("El Infante " + id + " no puede atacar"
                    + " porque esta a " + distanciaEnemigo + " metros del enemigo");
        }
    }

    /**
     *Imprime la informacion actual del Soldado
     */
    @Override
    public void reportar() {
        System.out.println("Soy el Soldado " + id
                + ", me llamo " + nombre
                + ",  mi especialidad es " + reporte.getReporte()
                + ", mis puntos de vida son " + vida
                + " y me encuentro a " + distanciaEnemigo + " metros del enemigo");
    }

    /**
     *Devuelve la especialidad del soldado (Infante, caballero o artillero)
     *@return la especialidad
     */
    @Override
    public String getEspecialidad(){
        return reporte.getReporte();
    }

    /**
     *Devuelve la vida del soldado
     *@return la vida del soldado
     */
    @Override
    public int getVida(){
        return vida;
    }

    /**
     *Devuelve el movimiento del soldado
     *@return el movimiento
     */
    @Override
    public Movimiento getMovimiento(){
        return movimiento;
    }

    /**
     *Devuelve el ataque del soldado
     *@return el ataque
     */
    @Override
    public Ataque getAtaque(){
        return ataque;
    }

    /**
     *Devuelve al enemigo del soldado
     *@return el enemigo
     */
    @Override
    public Enemigo getEnemigo(){
        return enemigo;
    }

}
