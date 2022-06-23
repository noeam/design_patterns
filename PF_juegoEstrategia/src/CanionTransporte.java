/**
*Clase Cañon trasporte. Crea un Movimiento de tipo Cañon.
*/
public class CanionTransporte implements Movimiento {
    int movimiento = 10;//movimiento lento

    /**
     * Metodo para conocer cuanto se mueve un caballo
     *@return los metros que se mueve un caballo
     */
    @Override
    public int getMovimiento() {
        return movimiento;
    }
}
