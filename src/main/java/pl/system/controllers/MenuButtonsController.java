package pl.system.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MenuButtonsController {

    private MainController mainController;

    @FXML
    public void checkBillsHistory(ActionEvent actionEvent) {
        System.out.println("Check Bills History");
    }

    @FXML
    public void startTheBill(ActionEvent actionEvent) {
        System.out.println("Start the bill");
    }

    @FXML
    public void checkStock(ActionEvent actionEvent) {
        System.out.println("Check stock");
    }

    @FXML
    public void quitAplication(ActionEvent actionEvent) {
        System.out.println("Exit program");
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }
}
