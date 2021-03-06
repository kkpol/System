package pl.system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception{


        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/PaneMain.fxml"));
        Pane pane = loader.load();
        Scene scene = new Scene(pane);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Nazwa testowa");
        primaryStage.show();
    }
}
