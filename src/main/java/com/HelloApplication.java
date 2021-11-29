package com;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage){
        TextField emailField = new TextField();
        TextField passwordField = new TextField();
        //Creating labels
        Label emailLabel = new Label("Email: ");
        Label passwordLabel = new Label("Password: ");
        Button check = new Button("Check");
        check.setOnAction(e ->
                {
                    boolean emailCheck = false;
                    boolean passwordLength = false;
                    boolean passwordInt = false;
                    boolean passwordLetter = false;
                    boolean passwordSpecial = false;
                    
                    String email = emailField.getText();
                    for (int i = 0; i < email.length(); i++) {
                        if (email.charAt(i) == '@') {
                            emailCheck = true;
                        }
                    }
                    String password = passwordField.getText();
                    if (password.length() >= 7) {
                        passwordLength = true;
                        String specialCharactersString = "*^&@!";
                        for (int i = 0; i < password.length(); i++) {
                            if (Character.isLetter(password.charAt(i))){
                                passwordLetter = true;
                            }
                            else if (Character.isDigit(password.charAt(i))){
                                passwordInt = true;
                            }
                            else if(specialCharactersString.contains(Character.toString(password.charAt(i)))) {
                                passwordSpecial = true;
                            }
                        }
                    }
                    if (passwordLength && passwordInt && passwordLetter && passwordSpecial && emailCheck){
                    System.out.println("All good");
                    }
                }
        );


        HBox box = new HBox(5);
        box.setPadding(new Insets(25, 5 , 5, 50));
        box.getChildren().addAll(emailLabel, emailField, passwordLabel, passwordField, check);
        Scene scene = new Scene(box, 700, 300);

        //Setting the stage
        stage.setTitle("Checker");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}