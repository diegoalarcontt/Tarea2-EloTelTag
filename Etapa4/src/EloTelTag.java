public class EloTelTag extends Equipo {

    private String nombre;

    public EloTelTag(String nombre,
                     double x,
                     double y,
                     double rapidez,
                     double angulo,
                     double deltaAngulo) {

        super(x, y, rapidez, angulo, deltaAngulo);

        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}