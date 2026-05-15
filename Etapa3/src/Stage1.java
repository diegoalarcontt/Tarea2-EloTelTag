import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Stage1 extends Application {

    private boolean running = false;
    private ETNube nube;

    @Override
    public void start(Stage stage) {

        nube = new ETNube();
        Territory territory = new Territory();

        try {
            Scanner scanner = new Scanner(new File("config.txt"));
            scanner.useLocale(Locale.US);

            scanner.nextLine();
            scanner.nextDouble();

            int numPeople = scanner.nextInt();

            for (int i = 0; i < numPeople; i++) {

                String ownerName = scanner.next();
                int numTags = scanner.nextInt();
                int hasTablet = scanner.nextInt();

                double cellX = scanner.nextDouble();
                double cellY = scanner.nextDouble();
                double cellRapidez = scanner.nextDouble();
                double cellAngulo = scanner.nextDouble();
                double cellDeltaAngulo = scanner.nextDouble();

                Cellular cellular = new Cellular(ownerName, cellX, cellY, cellRapidez, cellAngulo, cellDeltaAngulo);
                territory.addCellular(cellular);

                nube.agregarReporte("Celular registrado: " + ownerName);

                for (int j = 0; j < numTags; j++) {

                    String tagName = scanner.next();
                    double tagX = scanner.nextDouble();
                    double tagY = scanner.nextDouble();
                    double tagRapidez = scanner.nextDouble();
                    double tagAngulo = scanner.nextDouble();
                    double tagDeltaAngulo = scanner.nextDouble();

                    EloTelTag tag = new EloTelTag(tagName, tagX, tagY, tagRapidez, tagAngulo, tagDeltaAngulo);
                    territory.addTag(tag);

                    nube.agregarReporte("Tag registrado: " + tagName + " de " + ownerName);
                }

                if (hasTablet == 1) {

                    double tabletX = scanner.nextDouble();
                    double tabletY = scanner.nextDouble();
                    double tabletRapidez = scanner.nextDouble();
                    double tabletAngulo = scanner.nextDouble();
                    double tabletDeltaAngulo = scanner.nextDouble();

                    Tablet tablet = new Tablet(tabletX, tabletY, tabletRapidez, tabletAngulo, tabletDeltaAngulo);
                    territory.addTablet(tablet);

                    nube.agregarReporte("Tablet registrada de " + ownerName);
                }
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("No se encontró config.txt");
        }

        TerritoryView territoryView = new TerritoryView(territory, nube);

        MenuBar menuBar = new MenuBar();
        Menu simulationMenu = new Menu("Simulation");

        MenuItem playItem = new MenuItem("Play");
        MenuItem pauseItem = new MenuItem("Pause");
        MenuItem nubeItem = new MenuItem("Ver ETNube");

        simulationMenu.getItems().addAll(playItem, pauseItem, nubeItem);
        menuBar.getMenus().add(simulationMenu);

        BorderPane root = new BorderPane();
        root.setTop(menuBar);
        root.setCenter(territoryView);

        Scene scene = new Scene(root, 800, 530);

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                if (running) {
                    territoryView.actualizar();
                }
            }
        };

        timer.start();

        playItem.setOnAction(e -> running = true);
        pauseItem.setOnAction(e -> running = false);

        nubeItem.setOnAction(e -> {
            Stage ventana = new Stage();
            Label texto = new Label(nube.obtenerTextoReportes());
            Scene nubeScene = new Scene(new Pane(texto), 350, 250);

            ventana.setTitle("ETNube");
            ventana.setScene(nubeScene);
            ventana.show();
        });

        stage.setTitle("EloTelTag Simulation: Stage 2");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}