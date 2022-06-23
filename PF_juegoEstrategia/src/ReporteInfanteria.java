/**
*Clase Reporte infanteria. Devuelve el reporte de un soldado
*de tipo Infante
*/
public class ReporteInfanteria implements Reporte{
    String reporte = "Infante";//Atributo que identifica al soldado como Infante

    /**
     * Devuelve el tipo de especialidad del soldado
     * @return la especialidad
     */
    @Override
    public String getReporte() {
        return reporte;
    }
}
