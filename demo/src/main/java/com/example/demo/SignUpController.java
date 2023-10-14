package com.example.demo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class SignUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button SignUpButton;

    @FXML
    private CheckBox SignUpCheckBoxFemale;

    @FXML
    private CheckBox SignUpCheckBoxMale;

    @FXML
    private TextField SignUpLastName;

    @FXML
    private TextField SignUpName;

    @FXML
    private TextField login_field;

    @FXML
    private TextField password_field;

    @FXML
    private TextField SignUpJob;

    @FXML
    void initialize() {
        SignUpButton.setOnAction(event -> {

            signUpNewUser();
        });

    }

    private void signUpNewUser() {
        DatabaseHandler dbHandler = new DatabaseHandler();

        String firstName = SignUpName.getText();
        String lastName = SignUpLastName.getText();
        String userName = login_field.getText();
        String password = password_field.getText();
        String job = SignUpJob.getText();
        String gender = "";
        if(SignUpCheckBoxMale.isSelected()){
            gender = "Male";
        }else{
            gender = "Female";
        }
        User user = new User(firstName, lastName, userName, password, job, gender);

        dbHandler.signUpUser(user);
    }

}

