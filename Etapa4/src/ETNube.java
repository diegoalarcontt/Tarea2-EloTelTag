import java.util.ArrayList;

public class ETNube {

    private ArrayList<String> reportes;
    private int cantidadDetecciones;

    public ETNube() {
        reportes = new ArrayList<>();
        cantidadDetecciones = 0;
    }

    public void agregarReporte(String reporte) {

        if (reportes.size() > 20) {
            reportes.remove(0);
        }

        reportes.add(reporte);

        if (reporte.contains("detectó") || reporte.contains("detectado")) {
            cantidadDetecciones++;
        }
    }

    public ArrayList<String> getReportes() {
        return reportes;
    }

    public int getCantidadDetecciones() {
        return cantidadDetecciones;
    }

    public String obtenerTextoReportes() {

        if (reportes.isEmpty()) {
            return "No hay reportes en la nube.";
        }

        String texto = "";

        for (String reporte : reportes) {
            texto += reporte + "\n";
        }

        return texto;
    }
}