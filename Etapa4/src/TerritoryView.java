import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.io.File;
import java.util.ArrayList;

public class TerritoryView extends Pane {

    private ArrayList<CellularView> cellularViews;
    private ArrayList<EloTelTagView> tagViews;
    private ArrayList<TabletView> tabletViews;

    private ETNube nube;

    private int contadorFrames = 0;

    public TerritoryView(Territory territory, ETNube nube) {

        this.nube = nube;

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

                for (CellularView celular : cellularViews) {

                    double dx =
                            view.getTag().getX()
                            - celular.getCellular().getX();

                    double dy =
                            view.getTag().getY()
                            - celular.getCellular().getY();

                    double distancia =
                            Math.sqrt(dx * dx + dy * dy);

                    if (distancia < 100) {

                        nube.agregarReporte(
                                "Tag "
                                + view.getTag().getNombre()
                                + " detectó celular de "
                                + celular.getCellular().getOwnerName()
                        );
                    }
                }
            }
        }

        for (TabletView view : tabletViews) {

            view.getTablet().mover();
            view.actualizarPosicion();

            if (contadorFrames % 300 == 0) {

                view.mostrarRadar();

                for (CellularView celular : cellularViews) {

                    double dx =
                            view.getTablet().getX()
                            - celular.getCellular().getX();

                    double dy =
                            view.getTablet().getY()
                            - celular.getCellular().getY();

                    double distancia =
                            Math.sqrt(dx * dx + dy * dy);

                    if (distancia < 120) {

                        nube.agregarReporte(
                                "Tablet detectó celular de "
                                + celular.getCellular().getOwnerName()
                        );
                    }
                }
            }
        }
    }
}