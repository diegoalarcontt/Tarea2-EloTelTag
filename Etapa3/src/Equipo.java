public class Equipo {

    protected double x;
    protected double y;
    protected double rapidez;
    protected double angulo;
    protected double deltaAngulo;

    public Equipo(double x, double y, double rapidez,
                  double angulo, double deltaAngulo) {

        this.x = x;
        this.y = y;
        this.rapidez = rapidez;
        this.angulo = angulo;
        this.deltaAngulo = deltaAngulo;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }


    public void mover() {

    angulo += (Math.random() * 2 - 1) * deltaAngulo;

    double radianes = Math.toRadians(angulo);

    x += rapidez * Math.cos(radianes) * 0.1;
    y += rapidez * Math.sin(radianes) * 0.1;

    if (x <= 0 || x >= 780) {
        angulo = 180 - angulo;
    }

    if (y <= 0 || y >= 480) {
        angulo = -angulo;
    }
}
}   