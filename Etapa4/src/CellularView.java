import javafx.animation.AnimationTimer;
import javafx.scene.Scene;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class CellularView extends Pane {

    private Cellular cellular;

    private Rectangle body;
    private Label nameLabel;

    public CellularView(Cellular cellular) {

        this.cellular = cellular;

        body = new Rectangle(12, 20);
        body.setFill(Color.DODGERBLUE);

        nameLabel = new Label(cellular.getOwnerName());

        nameLabel.setLayoutX(15);
        nameLabel.setLayoutY(0);

        getChildren().addAll(body, nameLabel);

        actualizarPosicion();

        ContextMenu menu = new ContextMenu();

        MenuItem findMy = new MenuItem("Find My");

        menu.getItems().add(findMy);

        setOnContextMenuRequested(e -> {
            menu.show(this, e.getScreenX(), e.getScreenY());
        });

        findMy.setOnAction(e -> {

            Stage ventana = new Stage();

            Label info = new Label();

            Pane root = new Pane(info);

            Scene scene = new Scene(root, 250, 150);

            AnimationTimer timer = new AnimationTimer() {
                @Override
                public void handle(long now) {

                    info.setText(
                            "Dueño: " + cellular.getOwnerName() +
                            "\nPosición X: " + (int) cellular.getX() +
                            "\nPosición Y: " + (int) cellular.getY()
                    );
                }
            };

            timer.start();

            ventana.setTitle("Find My");
            ventana.setScene(scene);
            ventana.show();
        });
    }

    public void actualizarPosicion() {

        setLayoutX(cellular.getX());
        setLayoutY(cellular.getY());
    }

    public Cellular getCellular() {
        return cellular;
    }
}