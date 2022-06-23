/**
*Interfaz Movimiento. Las clases que la implentan pueden crear distintos
*tipos de movimientos ya sea a pie o en transportes.
*/
public interface Movimiento {
    
    /**
    *Devuelve el movimiento que hace el soldado
    *@return el movimiento
    */
    public int getMovimiento();
}
