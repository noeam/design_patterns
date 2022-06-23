/**
*Clase Caballo transporte. Es un Movimiento de tipo Caballo
*/
public class CaballoTransporte implements Movimiento{
    private int movimiento = 30;//movimiento rapido

    /**
     * Metodo para conocer cuanto se mueve un caballo
     *@return los metros que se mueve un caballo
     */
    @Override
    public int getMovimiento() {
        return movimiento;
    }
}
