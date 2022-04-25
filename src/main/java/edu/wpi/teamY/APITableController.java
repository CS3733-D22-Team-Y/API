package edu.wpi.teamY;

import io.github.palexdev.materialfx.controls.MFXButton;
import java.io.IOException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.*;
import javax.swing.text.TableView;

public class APITableController {
  @FXML private static MFXButton addButton;
  @FXML private MFXButton exitButton;
  @FXML private MFXButton deleteButton;
  @FXML private MFXButton modifyButton;
  @FXML private TableView tableView;
  /*
    @FXML TableColumn<String, String> location = new TableColumn<>();
    @FXML TableColumn<String, String> priority = new TableColumn<>();
    @FXML TableColumn<String, String> status = new TableColumn<>();
    @FXML TableColumn<String, String> employee = new TableColumn<>();
    @FXML TableColumn<String, String> notes = new TableColumn<>();
  */

  @FXML
  public void initialize() {}

  @FXML
  public void addNewButton() {
    try {

      Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("API.fxml")));
      /*
       * if "fx:controller" is not set in fxml
       * fxmlLoader.setController(NewWindowController);
       */
      Scene scene = new Scene(root);


    } catch (IOException e) {
      Logger logger = Logger.getLogger(getClass().getName());
      logger.log(Level.SEVERE, "Failed to create new Window.", e);
    }
  }

  @FXML
  public void exit() {
    // get a handle to the stage
    Stage stage = (Stage) exitButton.getScene().getWindow();
    // do what you have to do
    stage.close();
  }

  @FXML
  public void modifyCell() {
    Stage stage = (Stage) modifyButton.getScene().getWindow();
    // do what you have to do
    stage.close();
  }

  @FXML
  public void deleteCell() {
    Stage stage = (Stage) deleteButton.getScene().getWindow();
    // do what you have to do
    stage.close();
  }
}
