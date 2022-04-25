package edu.wpi.teamY;

import com.jfoenix.controls.JFXComboBox;
import io.github.palexdev.materialfx.controls.MFXButton;
import java.awt.*;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class APIController {
  @FXML private MFXButton exitButton;
  @FXML private MFXButton addButton;
  @FXML private TextField locationField;
  @FXML private JFXComboBox priorityPick;
  @FXML private JFXComboBox statusPick;
  @FXML private TextField employeeField;
  @FXML private TextField notesField;

  @FXML
  public void addValues() {
    locationField.getText();
    priorityPick.getValue();
    statusPick.getValue();
    employeeField.getText();
    notesField.getText();
  }

  @FXML
  public void exit() {
    // get a handle to the stage
    Stage stage = (Stage) exitButton.getScene().getWindow();
    // do what you have to do
    stage.close();
  }
}
