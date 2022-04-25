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
import com.jfoenix.controls.JFXComboBox;
import edu.wpi.teamY.Model.Location;
import io.github.palexdev.materialfx.controls.MFXButton;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javax.swing.*;

public class APITableController {
  @FXML private TextField locationField;
  @FXML private JFXComboBox priorityPick;
  @FXML private JFXComboBox statusPick;
  @FXML private TextField employeeField;
  @FXML private TextArea notesField;
  @FXML private MFXButton addButton;
  @FXML private MFXButton addButton1;
  @FXML private MFXButton exitButton;
  @FXML private MFXButton exitButton1;

  @FXML private MFXButton deleteButton;
  @FXML private MFXButton modifyButton;
  @FXML private TableView<SecurityService> tableView;
  @FXML private Pane pane1;
  @FXML private Pane pane2;
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
    pane1.setVisible(false);
    pane2.setVisible(true);
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

  public void addValues() {
    String loc = locationField.getText();
    statusPick.getValue();
    employeeField.getText();
    notesField.getText();
    DBManager.save(new Location(loc, 0, 0, "2", "building", "nodeType", "longName", "shortName"));
    DBManager.save(priorityPick);
  }
}
