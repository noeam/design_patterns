/**
*Clase Enemigo. Para crear al enemigo que el Soldado va a derrotar
*/
public class Enemigo {
    private int vida;
    private int distancia;

    /**
    *Constructor. Construye un enemigo con una vida y distancia inicial
    */
    public Enemigo(){
        this.vida = 5000; //modificar la vida para hacer pruebas
        this.distancia= 100;
    }

    /**
    *Constructor. Para personalizar un enemigo con vida y 
    *distancia a eleccion de quien lo construye
    *@param vida la vida del enemigo
    *@param distancia la distancia del enemigo
    */
    public Enemigo(int vida, int distancia){
        this.vida = vida;
        this.distancia= distancia;
    }

    /**
    *Devuelve la vida del enemigo haciendo que nunca tenga 
    *valor negativo.
    *@return la vida
    */    
    public int getVida() {
        if (vida <= 0) {
            vida = 0;
            return vida;
        }else{
            return vida;
        }    
    }

    /**
    *Asigna vida al enemigo
    *@param vida el valor nuevo de la vida del Enemigo
    */
    public void setVida(int vida) {
        this.vida = vida;
    }

    /**
    *Devuelve la distancia del enemigo
    *@return la distancia 
    */
    public int getDistancia() {
        return distancia;
    }
}
