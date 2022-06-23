/**
*Interfaz Soldado. Las clases que implemnetan esta
*interfaz podran crear Soldados con diferentes caracteríticas
*/

public interface Soldado {
    /**
    *Mueve al soldado para que pueda acercarse 
    *al enemigo
    */
    public void mover();
    
    /**
    *El soldado ataca al enemigo restándole
    *puntos de vida.
    */
    public void atacar();
    
    /**
    *Imprime la informacion actual del Soldado
    */
    public void reportar();
    
	/**
	*Devuelve la vida del soldado
	*@return la vida del soldado
	*/
    public int getVida();
    
    /**
    *Devuelve la especialidad del soldado (Infante, caballero o artillero)
    *@return la especialidad
    */
    public String getEspecialidad();
    
    /**
    *Devuelve el movimiento del soldado
    *@return el movimiento
    */
    public Movimiento getMovimiento(); 
    
	/**
    *Devuelve el ataque del soldado
    *@return el ataque
    */
    public Ataque getAtaque();
    
	/**
    *Devuelve al enemigo del soldado
    *@return el enemigo
    */
    public Enemigo getEnemigo();
}
