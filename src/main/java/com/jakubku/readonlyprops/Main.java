package com.jakubku.readonlyprops;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);
        Label label = new Label("Welcome");
        TextField textField = new TextField();
        Button button = new Button("Bind Label To Field");
        textField.setMaxWidth(200);
        root.getChildren().addAll(label, textField, button);
        button.setOnAction(actionEvent ->
            label.textProperty().bind(textField.textProperty())
        );
        Scene scene = new Scene(root, 550, 500);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
