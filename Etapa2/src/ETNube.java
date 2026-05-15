import java.util.ArrayList;

public class ETNube {

    private ArrayList<String> reportes;

    public ETNube() {
        reportes = new ArrayList<>();
    }

    public void agregarReporte(String reporte) {
        reportes.add(reporte);
    }

    public ArrayList<String> getReportes() {
        return reportes;
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