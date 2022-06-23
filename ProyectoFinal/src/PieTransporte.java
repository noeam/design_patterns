/**
*Clase Pie transporte es un Movimiento nomal de tipo A pie.
*/
public class PieTransporte implements Movimiento{
    private int movimiento = 20;//movimiento normal

    /**
     *Devuelve la distancia que se mueve a pie
     *@return la distancia
     */
    @Override
    public int getMovimiento() {
        return movimiento;
    }
}
