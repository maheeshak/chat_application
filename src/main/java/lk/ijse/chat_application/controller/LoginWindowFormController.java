package lk.ijse.chat_application.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.chat_application.dto.Client;

import java.io.IOException;

public class LoginWindowFormController {
    @FXML
    private TextField txtUserName;

    @FXML
    private JFXButton btnJoin;

    @FXML
    void btnJoinOnAction(ActionEvent event) {
        Client client = null;
        try {

            client = new Client(txtUserName.getText());

            Thread thread = new Thread(client);
            thread.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
