public class Cellular extends Equipo {

    private String ownerName;

    public Cellular(String ownerName,
                     double x,
                     double y,
                     double rapidez,
                     double angulo,
                     double deltaAngulo) {

        super(x, y, rapidez, angulo, deltaAngulo);

        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }
}