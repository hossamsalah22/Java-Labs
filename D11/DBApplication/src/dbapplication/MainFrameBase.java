package dbapplication;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class MainFrameBase extends Pane {

    protected final Label idLabel;
    protected final Label firstNameLabel;
    protected final Label middleNameLabel;
    protected final Label lastNameLabel;
    protected final Label emailLabel;
    protected final Label phoneLabel;
    protected final TextField idText;
    protected final TextField firstNameText;
    protected final TextField middleNameText;
    protected final TextField lastNameText;
    protected final TextField emailText;
    protected final TextField phoneText;
    protected final Button newBtn;
    protected final Button udateBtn;
    protected final Button deleteBtn;
    protected final Button firstBtn;
    protected final Button previousBtn;
    protected final Button nextBtn;
    protected final Button lastBtn;

    public MainFrameBase() {

        idLabel = new Label();
        firstNameLabel = new Label();
        middleNameLabel = new Label();
        lastNameLabel = new Label();
        emailLabel = new Label();
        phoneLabel = new Label();
        idText = new TextField();
        firstNameText = new TextField();
        middleNameText = new TextField();
        lastNameText = new TextField();
        emailText = new TextField();
        phoneText = new TextField();
        newBtn = new Button();
        udateBtn = new Button();
        deleteBtn = new Button();
        firstBtn = new Button();
        previousBtn = new Button();
        nextBtn = new Button();
        lastBtn = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        idLabel.setLayoutX(37.0);
        idLabel.setLayoutY(28.0);
        idLabel.setPrefHeight(26.0);
        idLabel.setPrefWidth(79.0);
        idLabel.setText("ID");

        firstNameLabel.setLayoutX(37.0);
        firstNameLabel.setLayoutY(67.0);
        firstNameLabel.setPrefHeight(26.0);
        firstNameLabel.setPrefWidth(79.0);
        firstNameLabel.setText("First Name");

        middleNameLabel.setLayoutX(37.0);
        middleNameLabel.setLayoutY(235.0);
        middleNameLabel.setPrefHeight(26.0);
        middleNameLabel.setPrefWidth(46.0);
        middleNameLabel.setText("Phone");

        lastNameLabel.setLayoutX(37.0);
        lastNameLabel.setLayoutY(187.0);
        lastNameLabel.setPrefHeight(26.0);
        lastNameLabel.setPrefWidth(79.0);
        lastNameLabel.setText("Email");

        emailLabel.setLayoutX(37.0);
        emailLabel.setLayoutY(146.0);
        emailLabel.setPrefHeight(26.0);
        emailLabel.setPrefWidth(79.0);
        emailLabel.setText("Last Name");

        phoneLabel.setLayoutX(37.0);
        phoneLabel.setLayoutY(104.0);
        phoneLabel.setPrefHeight(26.0);
        phoneLabel.setPrefWidth(79.0);
        phoneLabel.setText("Middle Name");

        idText.setDisable(true);
        idText.setLayoutX(148.0);
        idText.setLayoutY(29.0);
        idText.setPrefHeight(25.0);
        idText.setPrefWidth(339.0);

        firstNameText.setLayoutX(148.0);
        firstNameText.setLayoutY(68.0);
        firstNameText.setPrefHeight(25.0);
        firstNameText.setPrefWidth(339.0);

        middleNameText.setLayoutX(148.0);
        middleNameText.setLayoutY(105.0);
        middleNameText.setPrefHeight(25.0);
        middleNameText.setPrefWidth(339.0);

        lastNameText.setLayoutX(148.0);
        lastNameText.setLayoutY(147.0);
        lastNameText.setPrefHeight(25.0);
        lastNameText.setPrefWidth(339.0);

        emailText.setLayoutX(148.0);
        emailText.setLayoutY(188.0);
        emailText.setPrefHeight(25.0);
        emailText.setPrefWidth(339.0);

        phoneText.setLayoutX(148.0);
        phoneText.setLayoutY(236.0);
        phoneText.setPrefHeight(25.0);
        phoneText.setPrefWidth(339.0);

        newBtn.setLayoutX(51.0);
        newBtn.setLayoutY(330.0);
        newBtn.setMnemonicParsing(false);
        newBtn.setText("New");

        udateBtn.setLayoutX(496.0);
        udateBtn.setLayoutY(330.0);
        udateBtn.setMnemonicParsing(false);
        udateBtn.setText("Last");

        deleteBtn.setLayoutX(433.0);
        deleteBtn.setLayoutY(330.0);
        deleteBtn.setMnemonicParsing(false);
        deleteBtn.setText("Next");

        firstBtn.setLayoutX(349.0);
        firstBtn.setLayoutY(330.0);
        firstBtn.setMnemonicParsing(false);
        firstBtn.setText("Previous");

        previousBtn.setLayoutX(290.0);
        previousBtn.setLayoutY(330.0);
        previousBtn.setMnemonicParsing(false);
        previousBtn.setText("First");

        nextBtn.setLayoutX(191.0);
        nextBtn.setLayoutY(330.0);
        nextBtn.setMnemonicParsing(false);
        nextBtn.setText("Delete");

        lastBtn.setLayoutX(116.0);
        lastBtn.setLayoutY(330.0);
        lastBtn.setMnemonicParsing(false);
        lastBtn.setText("Update");

        getChildren().add(idLabel);
        getChildren().add(firstNameLabel);
        getChildren().add(middleNameLabel);
        getChildren().add(lastNameLabel);
        getChildren().add(emailLabel);
        getChildren().add(phoneLabel);
        getChildren().add(idText);
        getChildren().add(firstNameText);
        getChildren().add(middleNameText);
        getChildren().add(lastNameText);
        getChildren().add(emailText);
        getChildren().add(phoneText);
        getChildren().add(newBtn);
        getChildren().add(udateBtn);
        getChildren().add(deleteBtn);
        getChildren().add(firstBtn);
        getChildren().add(previousBtn);
        getChildren().add(nextBtn);
        getChildren().add(lastBtn);

    }
}
