/**
*Clase mosquete para representar un ataque de mosquete
*/
public class Mosquete implements Ataque{
    private int Danio = 40; //danio alto

    /**
     *Devuelve el danio que hace el mosquete
     *@return el danio
     */
    @Override
    public int getDanio() {
        return Danio;
    }
}
