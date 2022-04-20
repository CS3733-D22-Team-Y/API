package edu.wpi.teamY;

import io.github.palexdev.materialfx.controls.MFXButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;
import javax.swing.text.TableView;
import java.awt.event.ActionEvent;
import java.beans.EventHandler;
import java.io.IOException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class APITableController {
    @FXML private static MFXButton addButton;
    @FXML private MFXButton exitButton;
    @FXML private TableView tableView;

    public void addNewButton(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("API.fxml"));
            /*
             * if "fx:controller" is not set in fxml
             * fxmlLoader.setController(NewWindowController);
             */
            Scene scene = new Scene(fxmlLoader.load(), 630, 400);
            Stage stage = new Stage();
            stage.setTitle("New Window");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "Failed to create new Window.", e);
        }
    }


    @FXML
    public void exitButtonAction(){
        // get a handle to the stage
        Stage stage = (Stage) exitButton.getScene().getWindow();
        // do what you have to do
        stage.close();
    }
}
