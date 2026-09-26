package appli.todolist.accueil;

import appli.todolist.StartApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField emailField;

    @FXML
    private Label errorLabel;

    @FXML
    private Button inscriptionButton;

    @FXML
    private Button loginButton;

    @FXML
    private Button motDePasseOublieButton;

    @FXML
    private PasswordField passwordField;

    @FXML
    void onInscriptionButton(ActionEvent event) throws IOException {
        StartApplication.changeScene("accueil/Inscription");

    }

    @FXML
    void onLoginClick(ActionEvent event) {
        String email = emailField.getText();
        String motDePasse = passwordField.getText();
        System.out.println(email);
        System.out.println(motDePasse);

        if (email.equals("kamilyoubi27@gmail.com")&&(motDePasse.equals("AZERTY1234"))){
            errorLabel.setText("connexion reussi");
        }else{
            errorLabel.setText("Erreur dans un champs");
        }
    }

    @FXML
    void onMotDePasseOublieButton(ActionEvent event) {

    }

}
