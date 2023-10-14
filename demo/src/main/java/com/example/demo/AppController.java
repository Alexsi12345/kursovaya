package com.example.demo;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AppController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button EighthProjectButton;

    @FXML
    private Button FifthProjectButton;

    @FXML
    private Button FirstProjectButton;

    @FXML
    private Button FourthProjectButton;

    @FXML
    private Button SecondProjectButton;

    @FXML
    private Button SeventhProjectButton;

    @FXML
    private Button SixthProjectButton;

    @FXML
    private Button ThirdProjectButton;

    @FXML
    void initialize() {
        FirstProjectButton.setOnAction(event -> {
            NewScene("first_project.fxml");

        });
        SecondProjectButton.setOnAction(event -> {
            NewScene("second_project.fxml");

        });
        ThirdProjectButton.setOnAction(event -> {
            NewScene("third_project.fxml");

        });
        FourthProjectButton.setOnAction(event -> {
            NewScene("fourth_project.fxml");

        });
        FifthProjectButton.setOnAction(event -> {
            NewScene("fifth_project.fxml");

        });
        SixthProjectButton.setOnAction(event -> {
            NewScene("sixth_project.fxml");

        });
        SeventhProjectButton.setOnAction(event -> {
            NewScene("seventh_project.fxml");

        });
        EighthProjectButton.setOnAction(event -> {
            NewScene("eighth_project.fxml");

        });
        }

    public void NewScene(String s){

        FirstProjectButton.getScene().getWindow().hide();

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(s));

        try {
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }
    }

