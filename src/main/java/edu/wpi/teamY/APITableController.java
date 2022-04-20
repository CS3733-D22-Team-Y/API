package edu.wpi.cs3733.d22.teamY.controllers;

import edu.wpi.cs3733.d22.teamY.App;
import io.github.palexdev.materialfx.controls.MFXButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.text.TableView;
import java.io.IOException;
import java.util.Objects;

public class APITableController {
    @FXML private static MFXButton addButton;
    @FXML private MFXButton exitButton;
    @FXML private TableView tableView;

    @FXML
    public void addNewButton(Stage primaryStage) throws IOException {
        SceneLoading.loadPopup("views/popups/API.fxml","views/SideBar.fxml");
    }

    @FXML
    public void exitButtonAction(){
        // get a handle to the stage
        Stage stage = (Stage) exitButton.getScene().getWindow();
        // do what you have to do
        stage.close();
    }
}
