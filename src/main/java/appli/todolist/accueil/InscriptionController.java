package appli.todolist.accueil;

import appli.todolist.StartApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class InscriptionController {

    @FXML
    private PasswordField confirmationField;

    @FXML
    private TextField emailField;

    @FXML
    private Label errorLabel;

    @FXML
    private Label errorLabel1;

    @FXML
    private Button inscriptionButton;

    @FXML
    private TextField nomField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField prenomField;

    @FXML
    private Button retourButton;

    @FXML
    void onInscriptionClick(ActionEvent event) {
        String nom = nomField.getText();
        String prenom= prenomField.getText();
        String email = emailField.getText();
        String motDePasse = passwordField.getText();
        String confirmation = confirmationField.getText();
        System.out.println(nom);
        System.out.println(prenom);
        System.out.println(email);
        System.out.println(motDePasse);
        System.out.println(confirmation);

        if(nom.isEmpty()||(prenom.isEmpty()||(email.isEmpty()||(motDePasse.isEmpty()||(confirmation.isEmpty()))))){
            errorLabel.setText("Un champs n est pas remplis");
        }else{
            errorLabel.setText("tout les champs sont remplie");
        }
        if (!motDePasse.equals(confirmation)){
            errorLabel1.setText("le mot de passe est différent");
        }else{
            errorLabel1.setText("mot de passe correct");
        }
        if(email.equals("kamilyoubi27@gmail.com")){
            errorLabel.setText("email deja utiliser veuillez changé");
        }


    }

    @FXML
    void onRetourClick(ActionEvent event) throws IOException {
        StartApplication.changeScene("accueil/Login");

    }

}
