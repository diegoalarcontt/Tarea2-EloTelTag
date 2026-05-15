import javafx.animation.ScaleTransition;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class EloTelTagView extends Pane {

    private EloTelTag tag;
    private Circle body;
    private Circle radar;

    public EloTelTagView(EloTelTag tag) {

        this.tag = tag;

        radar = new Circle(8);
        radar.setStroke(Color.RED);
        radar.setFill(Color.TRANSPARENT);
        radar.setVisible(false);

        body = new Circle(8);
        body.setFill(Color.RED);

        Label label = new Label(tag.getNombre());
        label.setLayoutX(12);
        label.setLayoutY(0);

        getChildren().addAll(radar, body, label);

        actualizarPosicion();
    }

    public void mostrarRadar() {

        radar.setRadius(8);
        radar.setVisible(true);

        ScaleTransition transition = new ScaleTransition(Duration.seconds(1), radar);
        transition.setFromX(1);
        transition.setFromY(1);
        transition.setToX(6);
        transition.setToY(6);

        transition.setOnFinished(e -> {
            radar.setVisible(false);
            radar.setScaleX(1);
            radar.setScaleY(1);
        });

        transition.play();
    }

    public void actualizarPosicion() {
        setLayoutX(tag.getX());
        setLayoutY(tag.getY());
    }

    public EloTelTag getTag() {
        return tag;
    }
}