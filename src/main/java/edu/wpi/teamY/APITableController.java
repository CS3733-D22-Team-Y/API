package edu.wpi.teamY;

import edu.wpi.teamY.Model.SecurityService;
import io.github.palexdev.materialfx.controls.MFXButton;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javax.swing.*;

public class APITableController {
  @FXML private static MFXButton addButton;
  @FXML private MFXButton exitButton;
  @FXML private MFXButton deleteButton;
  @FXML private MFXButton modifyButton;
  @FXML private TableView<SecurityService> tableView;
  /*
    @FXML TableColumn<String, String> location = new TableColumn<>();
    @FXML TableColumn<String, String> priority = new TableColumn<>();
    @FXML TableColumn<String, String> status = new TableColumn<>();
    @FXML TableColumn<String, String> employee = new TableColumn<>();
    @FXML TableColumn<String, String> notes = new TableColumn<>();
  */

  @FXML
  public void initialize() {
    List<SecurityService> securityServiceList;
    try {
      securityServiceList = DBManager.getAll(SecurityService.class);
    } catch (Exception e) {
      e.printStackTrace();
      securityServiceList = Collections.emptyList();
    }

    // Setup columns and how the data is displayed
    TableColumn<SecurityService, String> equipIDCol = new TableColumn<>("Location");
    equipIDCol.setCellValueFactory(new PropertyValueFactory<>("nodeID"));

    TableColumn<SecurityService, String> equipTypeCol = new TableColumn<>("Priority");
    equipTypeCol.setCellValueFactory(new PropertyValueFactory<>("priority"));

    TableColumn<SecurityService, String> equipLocIdCol = new TableColumn<>("Status");
    equipLocIdCol.setCellValueFactory(new PropertyValueFactory<>("status"));

    TableColumn<SecurityService, String> isCleanCol = new TableColumn<>("Assigned Employee");
    isCleanCol.setCellValueFactory(new PropertyValueFactory<>("assignedEmployee"));

    TableColumn<SecurityService, String> statusCol = new TableColumn<>("Additional Notes");
    statusCol.setCellValueFactory(new PropertyValueFactory<>("additionalNotes"));

    // Add columns into the tableview
    tableView.getColumns().add(equipIDCol);
    tableView.getColumns().add(equipTypeCol);
    tableView.getColumns().add(equipLocIdCol);
    tableView.getColumns().add(isCleanCol);
    tableView.getColumns().add(statusCol);

    // Add data to the tableview
    for (SecurityService e : securityServiceList) {
      // You can change how the data is displayed here
      tableView.getItems().add(e);
    }
  }

  @FXML
  public void addNewButton() {
    try {

      Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("API.fxml")));
      /*
       * if "fx:controller" is not set in fxml
       * fxmlLoader.setController(NewWindowController);
       */
      Scene scene = new Scene(root);
      // Stage stage = new Stage();
      // stage.setTitle("New Window");
      // stage.setScene(scene);
      // stage.show();
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
