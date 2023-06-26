package lk.ijse.chat_application.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginWindowFormController {
    @FXML
    private JFXButton btnLogin;
    @FXML
    private AnchorPane root;

    @FXML
    void btnLoginOnAction(ActionEvent event) {
        AnchorPane anchorPane = null;
        try {
            anchorPane = FXMLLoader.load(getClass().getResource("/view/server_start_form.fxml"));

        Scene scene = new Scene(anchorPane);

        Stage stage = (Stage) root.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Chat Novo");
        stage.centerOnScreen();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
