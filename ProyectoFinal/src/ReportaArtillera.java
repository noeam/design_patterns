/**
*Clase Reporte Artilleria. Devuelve el reporte de un soldado
*de tipo artillero
*/
public class ReportaArtillera implements Reporte{
    private String reporte = "Artillero"; //Atributo que identifica al soldado como artillero

    /**
     * Devuelve el tipo de especialidad del soldado
     * @return la especialidad
     */
	@Override
    public String getReporte() {
        return reporte;
    }
}
