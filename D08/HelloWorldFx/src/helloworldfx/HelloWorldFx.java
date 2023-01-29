/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


/**
 *
 * @author hossa
 */
public class HelloWorldFx extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Text text = new Text();  
        text.setFont(Font.font("calibri",FontWeight.BLACK,FontPosture.REGULAR,20));  
        text.setFill(Color.RED);
        text.setText("Hello World");  
        text.setX(90);  
        text.setY(90);  
        Reflection ref = new Reflection();  
        ref.setBottomOpacity(0.2);  
        ref.setFraction(12);  
        ref.setTopOffset(10);  
        ref.setTopOpacity(0.2);  
        text.setEffect(ref);
        
        StackPane root = new StackPane();
        root.getChildren().add(text);
        
        Stop[] stops = new Stop[] { new Stop(0, Color.BLACK), new Stop(0.5, Color.WHITE), new Stop(1, Color.BLACK) };
        LinearGradient backGroundLabel = new LinearGradient(0, 0.1, 0, 1, true, CycleMethod.NO_CYCLE, stops);
        
        Scene scene = new Scene(root, 300, 250, backGroundLabel);

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
