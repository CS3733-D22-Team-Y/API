package edu.wpi.teamY;

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
  @FXML private TableView<Location> tableView;
  @FXML private Pane pane1;
  @FXML private Pane pane2;

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
