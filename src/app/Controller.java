package app;

import com.mahdi_abdurrahman.utilities.Calculator;
import com.mahdi_abdurrahman.utilities.Validator;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.awt.*;
import java.text.NumberFormat;

public class Controller {
    @FXML private TextField weightField;
    @FXML private TextField heightField;
    @FXML private TextField bodyMassIndexField;



    @FXML private void calculateButtonClicked() {
        Validator validation = new Validator();
        String errorMsg = "";

        errorMsg += validation.isDouble(weightField.getText(), "In the Weight field there");
        errorMsg += validation.isDouble(heightField.getText(), "In the Height field there");

        if (errorMsg.isEmpty()) {
            double weight = Double.parseDouble(weightField.getText());
            double height = Double.parseDouble(heightField.getText());

            double bodyMassIndex = Calculator.calculateBodyMassIndex(weight, height);

            NumberFormat bodyMassFormat = NumberFormat.getNumberInstance();
            bodyMassIndexField.setText(bodyMassFormat.format(bodyMassIndex));

        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Invalid Data");
            alert.setContentText(errorMsg);
            alert.showAndWait();
        }
    }//end of the calculateButtonClicked Method


    @FXML private void resetButtonClicked() {
        weightField.setText("");
        heightField.setText("");
        bodyMassIndexField.setText("");

    }//end of the resetButtonClicked Method
}//end of the Controller Class
