import java.util.ArrayList;
import java.util.List;

/**
*Clase Ejercito. Construye un ejercito conformado por una Lista
*de Comandantes
*/
public class Ejercito {
    private List<Comandante> pelotones = new ArrayList<Comandante>();

    /**
    *Construye un nuevo peloton y lo agrega al ejercito
    *@param comandante el comandante lider del peloton (el comandante ya tiene una lista de soldados)
    */
    public void agregaPeloton(Comandante comandante){
        pelotones.add(comandante);
    }

    /**
    *Ordena al ejercito completo atacar al enemigo
    */
    public void ataca(){
        for (Comandante integrante : pelotones) {
            integrante.atacar();
        }
    }

    /**
    *Mueve al ejercito completo para acercarse al enemigo
    */
    public void mover(){
        for (Comandante integrante : pelotones) {
            integrante.mover();
        }
    }

    /**
    * Reporta a todo el ejercito
    */
    public void presentar(){
        for (Comandante integrante : pelotones) {
            integrante.reportar();
        }
    }

    /**
    *Devuelve la lista de pelotones (Comandantes y soldados)
    *@return la lista de pelotones
    */
    public List<Comandante> getPelotones(){
        return pelotones;
    }

}
