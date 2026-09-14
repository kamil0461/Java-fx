package appli.todolist;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;



    @FXML
    private Button auRevoir;


    @FXML
    void auRevoirBouttun(ActionEvent event) {
        welcomeText.setText("Au revoir bg !");

    }

    @FXML
    void onHelloButtonClick(ActionEvent event) {
        welcomeText.setText("hello bg");

    }
}
