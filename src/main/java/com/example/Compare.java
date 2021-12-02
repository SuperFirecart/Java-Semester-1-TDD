package com.example;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class Compare {
    public TextField emailField = new TextField();
    public PasswordField passwordField = new PasswordField();
    public Button registerButton = new Button("Check Details");
    public Label responseLabel;

    public void compare() {
        Checker User = new Checker(emailField.getText(), passwordField.getText());

        if (!User.isAnEmail()) {
            responseLabel.setTextFill(Color.FIREBRICK);
            responseLabel.setText("Error in Email");
            User.reset();
        }
        else if (!User.isValidPassword()) {
            responseLabel.setTextFill(Color.FIREBRICK);
            responseLabel.setText("Error in Password");
            User.reset();
        }
        else {
            responseLabel.setTextFill(Color.MEDIUMSPRINGGREEN);
            responseLabel.setText("User Details are Valid");
        }
    }
}