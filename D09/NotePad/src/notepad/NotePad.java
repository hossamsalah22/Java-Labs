/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notepad;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author hossa
 */
public class NotePad extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        NotepadMainFrameBase root = new NotepadMainFrameBase();
        
        Scene scene = new Scene(root, 650, 500);
        
        primaryStage.setTitle("NotePad");
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
