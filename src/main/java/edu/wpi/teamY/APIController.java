package edu.wpi.teamY;

import com.jfoenix.controls.JFXComboBox;
import edu.wpi.teamY.Model.SecurityService;
import io.github.palexdev.materialfx.controls.MFXButton;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class APIController {
  @FXML private MFXButton exitButton;
  @FXML private MFXButton addButton;
  @FXML private TextField locationField;
  @FXML private JFXComboBox priorityPick;
  @FXML private JFXComboBox statusPick;
  @FXML private TextField employeeField;
  @FXML private TextArea notesField;

  @FXML
  public void initialize() {
    priorityPick.getItems().addAll("low", "medium", "high");
    statusPick.getItems().addAll("low", "medium", "high");
  }

  @FXML
  public void addValues() {
    locationField.getText();
    priorityPick.getValue();
    statusPick.getValue();
    employeeField.getText();
    notesField.getText();

    DBManager.save(
        new SecurityService(
            locationField.getText(),
            (String) priorityPick.getValue(),
            (String) statusPick.getValue(),
            employeeField.getText(),
            notesField.getText()));
  }

  @FXML
  public void exit() {
    // get a handle to the stage
    Stage stage = (Stage) exitButton.getScene().getWindow();
    // do what you have to do
    stage.close();
  }
}
