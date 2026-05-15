import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.io.File;
import java.util.ArrayList;

public class TerritoryView extends Pane {

    private ArrayList<CellularView> cellularViews;
    private ArrayList<EloTelTagView> tagViews;
    private ArrayList<TabletView> tabletViews;

    private int contadorFrames = 0;

    public TerritoryView(Territory territory) {

        cellularViews = new ArrayList<>();
        tagViews = new ArrayList<>();
        tabletViews = new ArrayList<>();

        setPrefSize(800, 500);

        File archivoImagen = new File("Placeres.jpg");

        if (archivoImagen.exists()) {
            Image image = new Image(archivoImagen.toURI().toString());
            ImageView background = new ImageView(image);
            background.setFitWidth(800);
            background.setFitHeight(500);
            getChildren().add(background);
        } else {
            setStyle("-fx-background-color: lightgray;");
        }

        for (Cellular cellular : territory.getCelulares()) {
            CellularView view = new CellularView(cellular);
            cellularViews.add(view);
            getChildren().add(view);
        }

        for (EloTelTag tag : territory.getTags()) {
            EloTelTagView view = new EloTelTagView(tag);
            tagViews.add(view);
            getChildren().add(view);
        }

        for (Tablet tablet : territory.getTablets()) {
            TabletView view = new TabletView(tablet);
            tabletViews.add(view);
            getChildren().add(view);
        }
    }

    public void actualizar() {

        contadorFrames++;

        for (CellularView view : cellularViews) {
            view.getCellular().mover();
            view.actualizarPosicion();
        }

        for (EloTelTagView view : tagViews) {
            view.getTag().mover();
            view.actualizarPosicion();

            if (contadorFrames % 240 == 0) {
                view.mostrarRadar();
            }
        }

        for (TabletView view : tabletViews) {
            view.getTablet().mover();
            view.actualizarPosicion();

            if (contadorFrames % 300 == 0) {
                view.mostrarRadar();
            }
        }
    }
}