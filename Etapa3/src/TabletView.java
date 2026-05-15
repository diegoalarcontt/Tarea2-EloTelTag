import javafx.animation.ScaleTransition;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class TabletView extends Pane {

    private Tablet tablet;
    private Circle radar;

    public TabletView(Tablet tablet) {

        this.tablet = tablet;

        radar = new Circle(10);
        radar.setStroke(Color.GREEN);
        radar.setFill(Color.TRANSPARENT);
        radar.setVisible(false);

        Rectangle body = new Rectangle(22, 16);
        body.setFill(Color.GREEN);

        Label label = new Label("Tablet");
        label.setLayoutX(25);
        label.setLayoutY(0);

        getChildren().addAll(radar, body, label);

        actualizarPosicion();
    }

    public void mostrarRadar() {

        radar.setRadius(10);
        radar.setVisible(true);

        ScaleTransition transition = new ScaleTransition(Duration.seconds(1), radar);
        transition.setFromX(1);
        transition.setFromY(1);
        transition.setToX(5);
        transition.setToY(5);

        transition.setOnFinished(e -> {
            radar.setVisible(false);
            radar.setScaleX(1);
            radar.setScaleY(1);
        });

        transition.play();
    }

    public void actualizarPosicion() {
        setLayoutX(tablet.getX());
        setLayoutY(tablet.getY());
    }

    public Tablet getTablet() {
        return tablet;
    }
}