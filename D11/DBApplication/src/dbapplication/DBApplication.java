/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dbapplication.MainFrameBase;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author hossa
 */
public class DBApplication extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        MainFrameBase root = new MainFrameBase();
        
        Scene scene = new Scene(root, 600, 400);
        
        primaryStage.setTitle("Database Application");
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
