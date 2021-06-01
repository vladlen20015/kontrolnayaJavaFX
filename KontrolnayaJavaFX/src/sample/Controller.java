package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import java.io.IOException;

public class Controller {
    @FXML
    private TextField login;
    @FXML
    private TextField password;
    @FXML
    private Label wrong;
    @FXML
    private Button button;

    public void userLogIn(ActionEvent event) throws IOException{
        checkLogin();
    }

    private void checkLogin() throws IOException{
        if (login.getText().toString().equals("admin") && password.getText().toString().equals("pass")){
            wrong.setText("Hello Admin!");
        }

        else {
            wrong.setText("Ошибка авторизации!");
        }
    }
}
