package sample;

import javafx.fxml.FXML;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Controller {
    @FXML
    TextField loginField;

    @FXML
    PasswordField passField;

    @FXML
    VBox rootElement;

    public void tryToLogin() throws Exception {
        if (loginField.getText().equals("login") && passField.getText().equals("pass")) {
            Stage mystage = (Stage)rootElement.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("main.fxml"));
            Parent root = fxmlLoader.load();
            mystage.setTitle("Main");
            mystage.setScene(new Scene(root, 800, 800));

            ControllerMain cm = (ControllerMain)fxmlLoader.getController();
            cm.str = "Java";
            mystage.show();
        }
    }
}
