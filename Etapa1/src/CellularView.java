import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.Scene;

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

            Label info = new Label(
                    "Dueño: " + cellular.getOwnerName() +
                    "\nPosición X: " + cellular.getX() +
                    "\nPosición Y: " + cellular.getY()
            );

            Scene scene = new Scene(new Pane(info), 220, 120);

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