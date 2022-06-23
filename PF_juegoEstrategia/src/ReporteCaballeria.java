/**
*Clase Reporte Caballeria. Devuelve el reporte de un soldado
*de tipo caballero
*/
public class ReporteCaballeria implements Reporte{
    String reporte = "Caballero"; //Atributo que identifica al soldado como caballero

    /**
     * Devuelve el tipo de especialidad del soldado
     * @return la especialidad
     */
	@Override
    public String getReporte() {
        return reporte;
    }
}
