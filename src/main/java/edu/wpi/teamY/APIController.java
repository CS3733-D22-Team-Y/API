package edu.wpi.teamY;

import com.jfoenix.controls.JFXComboBox;
import io.github.palexdev.materialfx.controls.MFXButton;
import javafx.fxml.FXML;
import javafx.stage.Stage;

import java.awt.*;

public class APIController {
    @FXML private MFXButton exitButton;
    @FXML
    TextField locationID;
    @FXML
    JFXComboBox priorityPick;
    @FXML
    JFXComboBox statusPick;
    @FXML
    TextField employeeField;
    @FXML
    TextField notesField;

    @FXML
    public void addValues(){
        locationID.getText();
        priorityPick.getValue();
        statusPick.getValue();
        employeeField.getText();
        notesField.getText();
    }

    @FXML
    public void exitButtonAction(){
        // get a handle to the stage
        Stage stage = (Stage) exitButton.getScene().getWindow();
        // do what you have to do
        stage.close();
    }
}
