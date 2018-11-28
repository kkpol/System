package pl.system.controllers;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

public class MainController {


    @FXML
    private MenuButtonsController menuButtonsController;

    @FXML
    private Pane pane;

    @FXML
    private void intialize(){
        menuButtonsController.setMainController(this);
    }
}
