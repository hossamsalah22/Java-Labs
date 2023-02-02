/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapplication;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javax.sql.DataSource;

/**
 *
 * @author hossa
 */
public class GUIApplication extends Application {

    static boolean flag = true;
    static ResultSet resultSet = null;
    Connection connection = null;
    Statement statement = null;

    @Override
    public void start(Stage primaryStage) {

        MainDocumentBase root = new MainDocumentBase();
        Scene scene = new Scene(root, 600, 400);

        primaryStage.setTitle("DataBase GUI Application");
        primaryStage.setScene(scene);
        primaryStage.show();

        DataSource dataSource = MyDataSourceFactory.getMySQLDataSource();

        try {
            connection = dataSource.getConnection();
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE,
                    ResultSet.HOLD_CURSORS_OVER_COMMIT);
            resultSet = statement.executeQuery("SELECT id, first_name, middle_name, last_name, email, phone FROM emps");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Add New Record
        root.newBtn.setOnAction((e) -> {
            flag = false;
            root.idField.setText("");
            root.firstNameField.setText("");
            root.middleNameField.setText("");
            root.lastNameField.setText("");
            root.emailField.setText("");
            root.phoneField.setText("");
        });

        // Update Button Actions
        root.updateBtn.setOnAction((event) -> {
            if (root.firstNameField.getText().isEmpty()
                    || root.middleNameField.getText().isEmpty()
                    || root.lastNameField.getText().isEmpty()
                    || root.emailField.getText().isEmpty()
                    || root.phoneField.getText().isEmpty()) {
                Alert alert = new Alert(AlertType.ERROR, "There is Empty Fields");
                alert.setHeaderText("");
                alert.show();
                return;
            }
            if (flag) {
                try {
                    resultSet.updateString(2, root.firstNameField.getText());
                    resultSet.updateString(3, root.middleNameField.getText());
                    resultSet.updateString(4, root.lastNameField.getText());
                    resultSet.updateString(5, root.emailField.getText());
                    resultSet.updateString(6, root.phoneField.getText());
                    resultSet.updateRow();
                    Alert alert = new Alert(AlertType.INFORMATION, "Data Updated Successfully");
                    alert.setHeaderText("");
                    alert.show();
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                try {
                    resultSet.moveToInsertRow();
                    resultSet.updateString(2, root.firstNameField.getText());
                    resultSet.updateString(3, root.middleNameField.getText());
                    resultSet.updateString(4, root.lastNameField.getText());
                    resultSet.updateString(5, root.emailField.getText());
                    resultSet.updateString(6, root.phoneField.getText());
                    resultSet.insertRow();
                    resultSet.moveToCurrentRow();
                    flag = true;
                    System.out.println("Inserted");
                    // Alert User
                    Alert alert = new Alert(AlertType.INFORMATION, "Data Added Successfully");
                    alert.setHeaderText("");
                    alert.show();
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        // Delete Record
        root.deleteBtn.setOnAction((event) -> {
            if (root.firstNameField.getText().isEmpty()
                    || root.middleNameField.getText().isEmpty()
                    || root.lastNameField.getText().isEmpty()
                    || root.emailField.getText().isEmpty()
                    || root.phoneField.getText().isEmpty()) {
                Alert alert = new Alert(AlertType.ERROR, "Nothing to delete");
                alert.setHeaderText("");
                alert.show();
                return;
            }
            Alert alert = new Alert(AlertType.CONFIRMATION, "Are You Sure?");
            alert.setHeaderText("");
            alert.showAndWait();
            if (alert.getResult().getText().equals("OK")) {
                try {
                    resultSet.deleteRow();
                    if (resultSet.first())
                        resultSet.next();
                    else
                        resultSet.previous();
                    root.idField.setText(resultSet.getString(1));
                    root.firstNameField.setText(resultSet.getString(2));
                    root.middleNameField.setText(resultSet.getString(3));
                    root.lastNameField.setText(resultSet.getString(4));
                    root.emailField.setText(resultSet.getString(5));
                    root.phoneField.setText(resultSet.getString(6));
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                return;
            }
        });

        // Display First Record
        root.firstBtn.setOnAction((event) -> {
            try {
                resultSet.first();
                root.idField.setText(resultSet.getString(1));
                root.firstNameField.setText(resultSet.getString(2));
                root.middleNameField.setText(resultSet.getString(3));
                root.lastNameField.setText(resultSet.getString(4));
                root.emailField.setText(resultSet.getString(5));
                root.phoneField.setText(resultSet.getString(6));
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        });

        // Display previous record of currnet one if it is not the first one
        root.prevBtn.setOnAction((event) -> {
            try {
                resultSet.previous();
                root.idField.setText(resultSet.getString(1));
                root.firstNameField.setText(resultSet.getString(2));
                root.middleNameField.setText(resultSet.getString(3));
                root.lastNameField.setText(resultSet.getString(4));
                root.emailField.setText(resultSet.getString(5));
                root.phoneField.setText(resultSet.getString(6));
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        });

        // Display next record of currnet one if it is not the last one
        root.nextBtn.setOnAction((event) -> {
            try {
                resultSet.next();
                root.idField.setText(resultSet.getString(1));
                root.firstNameField.setText(resultSet.getString(2));
                root.middleNameField.setText(resultSet.getString(3));
                root.lastNameField.setText(resultSet.getString(4));
                root.emailField.setText(resultSet.getString(5));
                root.phoneField.setText(resultSet.getString(6));
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        });

        // Display last Record
        root.lastBtn.setOnAction((event) -> {
            try {
                resultSet.last();
                root.idField.setText(resultSet.getString(1));
                root.firstNameField.setText(resultSet.getString(2));
                root.middleNameField.setText(resultSet.getString(3));
                root.lastNameField.setText(resultSet.getString(4));
                root.emailField.setText(resultSet.getString(5));
                root.phoneField.setText(resultSet.getString(6));
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        });

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
