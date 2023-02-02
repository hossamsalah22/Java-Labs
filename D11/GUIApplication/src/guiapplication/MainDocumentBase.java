package guiapplication;

import javafx.scene.control.Button;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class MainDocumentBase extends Pane {

    protected final Text id;
    protected final TextField idField;
    protected final Text first_name;
    protected final TextField firstNameField;
    protected final Text middle_name;
    protected final TextField middleNameField;
    protected final Text last_name;
    protected final TextField lastNameField;
    protected final Text email;
    protected final TextField emailField;
    protected final Text phone;
    protected final TextField phoneField;
    protected final Button newBtn;
    protected final Button updateBtn;
    protected final Button deleteBtn;
    protected final Button firstBtn;
    protected final Button prevBtn;
    protected final Button nextBtn;
    protected final Button lastBtn;
    protected final ToolBar toolBar;
    protected final Text text5;
    protected final Separator separator;
    protected final Separator separator0;
    protected final Separator separator1;
    protected final Separator separator2;
    protected final Separator separator3;
    protected final Text text6;
    protected int row = 1;

    public MainDocumentBase() {

        id = new Text();
        idField = new TextField();
        first_name = new Text();
        firstNameField = new TextField();
        middle_name = new Text();
        middleNameField = new TextField();
        last_name = new Text();
        lastNameField = new TextField();
        email = new Text();
        emailField = new TextField();
        phone = new Text();
        phoneField = new TextField();
        newBtn = new Button();
        updateBtn = new Button();
        deleteBtn = new Button();
        firstBtn = new Button();
        prevBtn = new Button();
        nextBtn = new Button();
        lastBtn = new Button();
        toolBar = new ToolBar();
        text5 = new Text();
        separator = new Separator();
        separator0 = new Separator();
        separator1 = new Separator();
        separator2 = new Separator();
        separator3 = new Separator();
        text6 = new Text();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        id.setLayoutX(64.0);
        id.setLayoutY(83.0);
        id.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        id.setStrokeWidth(0.0);
        id.setText("ID");
        id.setFont(new Font("System Bold", 14.0));

        idField.setDisable(true);
        idField.setAlignment(javafx.geometry.Pos.BOTTOM_LEFT);
        idField.setLayoutX(164.0);
        idField.setLayoutY(65.0);
        idField.setPrefHeight(26.0);
        idField.setPrefWidth(196.0);

        first_name.setLayoutX(44.0);
        first_name.setLayoutY(128.0);
        first_name.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        first_name.setStrokeWidth(0.0);
        first_name.setText("First Name");
        first_name.setFont(new Font("System Bold", 14.0));

        firstNameField.setLayoutX(164.0);
        firstNameField.setLayoutY(110.0);
        firstNameField.setPrefHeight(26.0);
        firstNameField.setPrefWidth(196.0);

        middle_name.setLayoutX(35.0);
        middle_name.setLayoutY(173.0);
        middle_name.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        middle_name.setStrokeWidth(0.0);
        middle_name.setText("Middle Name");
        middle_name.setFont(new Font("System Bold", 14.0));

        middleNameField.setLayoutX(164.0);
        middleNameField.setLayoutY(155.0);
        middleNameField.setPrefHeight(26.0);
        middleNameField.setPrefWidth(196.0);

        last_name.setLayoutX(45.0);
        last_name.setLayoutY(218.0);
        last_name.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        last_name.setStrokeWidth(0.0);
        last_name.setText("Last Name");
        last_name.setFont(new Font("System Bold", 14.0));

        lastNameField.setLayoutX(164.0);
        lastNameField.setLayoutY(200.0);
        lastNameField.setPrefHeight(26.0);
        lastNameField.setPrefWidth(196.0);

        email.setLayoutX(54.0);
        email.setLayoutY(263.0);
        email.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        email.setStrokeWidth(0.0);
        email.setText("Email");
        email.setFont(new Font("System Bold", 14.0));

        emailField.setLayoutX(164.0);
        emailField.setLayoutY(245.0);
        emailField.setPrefHeight(26.0);
        emailField.setPrefWidth(196.0);

        phone.setLayoutX(51.0);
        phone.setLayoutY(308.0);
        phone.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        phone.setStrokeWidth(0.0);
        phone.setText("Phone");
        phone.setFont(new Font("System Bold", 14.0));

        phoneField.setLayoutX(164.0);
        phoneField.setLayoutY(290.0);
        phoneField.setPrefHeight(26.0);
        phoneField.setPrefWidth(196.0);

        // add new emp
        newBtn.setLayoutX(100.0);
        newBtn.setLayoutY(354.0);
        newBtn.setMinHeight(10.0);
        newBtn.setMnemonicParsing(false);
        newBtn.setPrefHeight(33.0);
        newBtn.setPrefWidth(58.0);
        newBtn.setText("New");

        // update emp Data
        updateBtn.setLayoutX(170.0);
        updateBtn.setLayoutY(354.0);
        updateBtn.setMinHeight(10.0);
        updateBtn.setMnemonicParsing(false);
        updateBtn.setPrefHeight(33.0);
        updateBtn.setPrefWidth(58.0);
        updateBtn.setText("Update");

        deleteBtn.setLayoutX(240.0);
        deleteBtn.setLayoutY(354.0);
        deleteBtn.setMinHeight(10.0);
        deleteBtn.setMnemonicParsing(false);
        deleteBtn.setPrefHeight(33.0);
        deleteBtn.setPrefWidth(58.0);
        deleteBtn.setText("Delete");

        // Get First Record
        firstBtn.setLayoutX(310.0);
        firstBtn.setLayoutY(354.0);
        firstBtn.setMinHeight(10.0);
        firstBtn.setMnemonicParsing(false);
        firstBtn.setPrefHeight(33.0);
        firstBtn.setPrefWidth(58.0);
        firstBtn.setText("First");

        // Get Previous
        prevBtn.setLayoutX(380.0);
        prevBtn.setLayoutY(354.0);
        prevBtn.setMinHeight(10.0);
        prevBtn.setMnemonicParsing(false);
        prevBtn.setPrefHeight(33.0);
        prevBtn.setPrefWidth(58.0);
        prevBtn.setText("Previous");

        // Get Next Record
        nextBtn.setLayoutX(450.0);
        nextBtn.setLayoutY(354.0);
        nextBtn.setMinHeight(10.0);
        nextBtn.setMnemonicParsing(false);
        nextBtn.setPrefHeight(33.0);
        nextBtn.setPrefWidth(58.0);
        nextBtn.setText("Next");

        // Get LAst Emp
        lastBtn.setLayoutX(520.0);
        lastBtn.setLayoutY(354.0);
        lastBtn.setMinHeight(10.0);
        lastBtn.setMnemonicParsing(false);
        lastBtn.setPrefHeight(33.0);
        lastBtn.setPrefWidth(58.0);
        lastBtn.setText("Last");

        toolBar.setLayoutX(-5.0);
        toolBar.setLayoutY(-6.0);
        toolBar.setOpacity(0.75);
        toolBar.setPrefHeight(45.0);
        toolBar.setPrefWidth(606.0);

        text5.setFill(javafx.scene.paint.Color.BLACK);
        text5.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        text5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text5.setStrokeWidth(0.0);
        text5.setText("Employee Information");
        text5.setWrappingWidth(259.9669530391693);
        text5.setFont(new Font("System Bold", 16.0));

        separator.setLayoutX(14.0);
        separator.setLayoutY(51.0);
        separator.setPrefHeight(3.0);
        separator.setPrefWidth(90.0);

        separator0.setLayoutX(243.0);
        separator0.setLayoutY(53.0);
        separator0.setPrefHeight(3.0);
        separator0.setPrefWidth(334.0);

        separator1.setLayoutX(11.0);
        separator1.setLayoutY(52.0);
        separator1.setOrientation(javafx.geometry.Orientation.VERTICAL);
        separator1.setPrefHeight(290.0);
        separator1.setPrefWidth(4.0);

        separator2.setLayoutX(11.0);
        separator2.setLayoutY(340.0);
        separator2.setPrefHeight(3.0);
        separator2.setPrefWidth(566.0);

        separator3.setLayoutX(574.0);
        separator3.setLayoutY(54.0);
        separator3.setOrientation(javafx.geometry.Orientation.VERTICAL);
        separator3.setPrefHeight(290.0);
        separator3.setPrefWidth(4.0);

        text6.setLayoutX(124.0);
        text6.setLayoutY(58.0);
        text6.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text6.setStrokeWidth(0.0);
        text6.setText("Personal Details");
        text6.setWrappingWidth(100);
        text6.setFont(new Font("System Italic", 14.0));

        getChildren().add(id);
        getChildren().add(idField);
        getChildren().add(first_name);
        getChildren().add(firstNameField);
        getChildren().add(middle_name);
        getChildren().add(middleNameField);
        getChildren().add(last_name);
        getChildren().add(lastNameField);
        getChildren().add(email);
        getChildren().add(emailField);
        getChildren().add(phone);
        getChildren().add(phoneField);
        getChildren().add(newBtn);
        getChildren().add(updateBtn);
        getChildren().add(deleteBtn);
        getChildren().add(firstBtn);
        getChildren().add(prevBtn);
        getChildren().add(nextBtn);
        getChildren().add(lastBtn);
        toolBar.getItems().add(text5);
        getChildren().add(toolBar);
        getChildren().add(separator);
        getChildren().add(separator0);
        getChildren().add(separator1);
        getChildren().add(separator2);
        getChildren().add(separator3);
        getChildren().add(text6);

    }
}
