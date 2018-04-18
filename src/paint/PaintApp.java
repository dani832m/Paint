//Kildekoden for app'en er placeret i pakken "paint"
package paint;

//Nødvendige imports
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author Daniel Lyck (dani832m)
 * Inspired by Almas Baimagambetov (almaslvl@gmail.com)
 */
public class PaintApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("paint.fxml"))));
        stage.setWidth(825);
        stage.setHeight(620);
        stage.setTitle("Paint App 1.0");
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}