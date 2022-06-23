/**
*Clase pistola. Para representar un Ataque de tipo arma
*/
public class Pistola implements Ataque{
    private int Danio = 30;//danio normal

    /**
     * Devuelve el danio que causa una pistola
     * @return el danio
     */
    @Override
    public int getDanio() {
        return Danio;
    }
}
