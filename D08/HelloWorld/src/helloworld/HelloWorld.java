/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.awt.Color;
import java.awt.MultipleGradientPaint.CycleMethod;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.LinearGradient;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author hossa
 */
public class HelloWorld extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Text text = new Text();  
        text.setFont(Font.font("calibri",FontWeight.BLACK,FontPosture.REGULAR,20));  
        text.setText("Hello World");  
        text.setX(90);  
        text.setY(90);  
        Reflection ref = new Reflection();  
        ref.setBottomOpacity(0.2);  
        ref.setFraction(12);  
        ref.setTopOffset(10);  
        ref.setTopOpacity(0.2);  
        text.setEffect(ref);  
//        
        StackPane root = new StackPane();
        root.getChildren().add(text);
        root.setId("text");

        Scene scene = new Scene(root, 300, 250);
        
        scene.getStylesheets().add(getClass().getResource("MyStyles.css").toString());
        root.getStyleClass().add("customStyle");
        text.getStyleClass().add("text");
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
