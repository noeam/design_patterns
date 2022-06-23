/**
*Clase Canion. Crea un Ataque de tipo Cañon
*/
public class Canion implements Ataque{
    int Danio = 50;//danio muy alto

    /**
     * Metodo para conocer el danio que genera un canion
     *@return el danio que causa el canion
     */
    @Override
    public int getDanio() {
        return Danio;
    }
}
