package notepad;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Optional;
import javafx.application.Platform;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCombination;
import javafx.stage.FileChooser;

public class NotepadMainFrameBase extends BorderPane {

    protected final MenuBar menuBar;
    protected final Menu fileMenu;
    protected final MenuItem newFile;
    protected final MenuItem openFile;
    protected final MenuItem saveFile;
    protected final SeparatorMenuItem separatorMenuItem;
    protected final MenuItem exitItem;
    protected final Menu editMenu;
    protected final MenuItem menuUndo;
    protected final SeparatorMenuItem separatorMenuItem0;
    protected final MenuItem cutText;
    protected final MenuItem copyText;
    protected final MenuItem pasteText;
    protected final MenuItem deleteText;
    protected final SeparatorMenuItem separatorMenuItem1;
    protected final MenuItem selectAllText;
    protected final Menu menuAbout;
    protected final MenuItem about;
    protected final TextArea textArea;

    public void save() {
        FileChooser saveFileChooser = new FileChooser();
        saveFileChooser.setTitle("Save File");
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("(*.txt)", "*.txt");
        saveFileChooser.getExtensionFilters().add(extFilter);
        File file = saveFileChooser.showSaveDialog(null);
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(textArea.getText());
            fileWriter.close();
        } catch (IOException ex) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error ");
            alert.setContentText("can't save this file");
            alert.showAndWait();
        }
    }

    public void open() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open File");
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("(*.txt)", "*.txt");
        fileChooser.getExtensionFilters().add(extFilter);
        File file = fileChooser.showOpenDialog(null);
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            StringBuilder stringBuilder = new StringBuilder();
            String line = null;

            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line + "\n");
            }
            bufferedReader.close();
            textArea.setText(stringBuilder.toString());
        } catch (IOException ex) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error ");
            alert.setContentText("can't open this file");
            alert.showAndWait();
        }
    }

    public NotepadMainFrameBase() {

        menuBar = new MenuBar();
        fileMenu = new Menu();
        newFile = new MenuItem();
        openFile = new MenuItem();
        saveFile = new MenuItem();
        separatorMenuItem = new SeparatorMenuItem();
        exitItem = new MenuItem();
        editMenu = new Menu();
        menuUndo = new MenuItem();
        separatorMenuItem0 = new SeparatorMenuItem();
        cutText = new MenuItem();
        copyText = new MenuItem();
        pasteText = new MenuItem();
        deleteText = new MenuItem();
        separatorMenuItem1 = new SeparatorMenuItem();
        selectAllText = new MenuItem();
        menuAbout = new Menu();
        about = new MenuItem();
        textArea = new TextArea();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        BorderPane.setAlignment(menuBar, javafx.geometry.Pos.CENTER);

        fileMenu.setMnemonicParsing(false);
        fileMenu.setText("File");

        newFile.setMnemonicParsing(false);
        newFile.setText("New");
        newFile.setAccelerator(new KeyCodeCombination(KeyCode.N, KeyCombination.CONTROL_DOWN));

        newFile.setOnAction((e) -> {
            if (textArea.getText().length() == 0)
                textArea.clear();
            else {
                Alert alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle(" notepad");
                alert.setHeaderText("");
                alert.setContentText("Save Changes First!");
                ButtonType saveBtn = new ButtonType("SAVE");
                ButtonType dontSaveBtn = new ButtonType("Don't Save");
                ButtonType cancelBtn = new ButtonType("Cancel", ButtonData.CANCEL_CLOSE);
                alert.getButtonTypes().setAll(saveBtn, dontSaveBtn, cancelBtn);
                Optional<ButtonType> result = alert.showAndWait();
                if (result.get() == saveBtn) {
                    save();
                    textArea.clear();
                } else if (result.get() == dontSaveBtn) {
                    textArea.clear();
                }
            }
        });

        openFile.setMnemonicParsing(false);
        openFile.setText("Open");
        openFile.setAccelerator(new KeyCodeCombination(KeyCode.O, KeyCombination.CONTROL_DOWN));
        openFile.setOnAction((e) -> {
            if (textArea.getText().length() == 0)
                open();
            else {
                Alert alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle(" notepad");
                alert.setHeaderText("");
                alert.setContentText("Save Changes First!");
                ButtonType saveBtn = new ButtonType("SAVE");
                ButtonType dontSaveBtn = new ButtonType("Don't Save");
                ButtonType cancelBtn = new ButtonType("Cancel", ButtonData.CANCEL_CLOSE);
                alert.getButtonTypes().setAll(saveBtn, dontSaveBtn, cancelBtn);
                Optional<ButtonType> result = alert.showAndWait();
                if (result.get() == saveBtn) {
                    save();
                    open();
                } else if(result.get() == dontSaveBtn){
                    open();
                }
            }
        });

        saveFile.setMnemonicParsing(false);
        saveFile.setText("Save");
        saveFile.setAccelerator(new KeyCodeCombination(KeyCode.S, KeyCombination.CONTROL_DOWN));
        saveFile.setOnAction((e) -> {
            save();
        });

        separatorMenuItem.setMnemonicParsing(false);

        exitItem.setMnemonicParsing(false);
        exitItem.setText("Exit");
        exitItem.setAccelerator(new KeyCodeCombination(KeyCode.E, KeyCombination.CONTROL_DOWN));
        exitItem.setOnAction(actionEvent -> {
            if (textArea.getText().length() == 0)
                Platform.exit();
            else {
                Alert alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle(" notepad");
                alert.setHeaderText("");
                alert.setContentText("Save Changes First!");
                ButtonType saveBtn = new ButtonType("SAVE");
                ButtonType dontSaveBtn = new ButtonType("Don't Save");
                ButtonType cancelBtn = new ButtonType("Cancel", ButtonData.CANCEL_CLOSE);
                alert.getButtonTypes().setAll(saveBtn, dontSaveBtn, cancelBtn);
                Optional<ButtonType> result = alert.showAndWait();
                if (result.get() == saveBtn) {
                    save();
                    Platform.exit();
                } else if(result.get() == dontSaveBtn){
                    Platform.exit();
                }
            }
        });
        editMenu.setMnemonicParsing(false);
        editMenu.setText("Edit");

        menuUndo.setMnemonicParsing(false);
        menuUndo.setText("Undo");
        menuUndo.setOnAction((e) -> {
            textArea.undo();
        });

        separatorMenuItem0.setMnemonicParsing(false);

        cutText.setMnemonicParsing(false);
        cutText.setText("Cut");
        cutText.setOnAction((e) -> {
            textArea.cut();
        });

        copyText.setMnemonicParsing(false);
        copyText.setText("Copy");
        copyText.setOnAction((e) -> {
            textArea.copy();
        });

        pasteText.setMnemonicParsing(false);
        pasteText.setText("Paste");
        pasteText.setOnAction((e) -> {
            textArea.paste();
        });

        deleteText.setMnemonicParsing(false);
        deleteText.setText("Delete");
        deleteText.setOnAction((e) -> {
            textArea.deleteText(textArea.getSelection());
        });

        separatorMenuItem1.setMnemonicParsing(false);

        selectAllText.setMnemonicParsing(false);
        selectAllText.setText("Select All");
        selectAllText.setOnAction((e) -> {
            textArea.selectAll();
        });

        menuAbout.setMnemonicParsing(false);
        menuAbout.setText("Help");

        about.setMnemonicParsing(false);
        about.setText("About NotePad");
        about.setAccelerator(new KeyCodeCombination(KeyCode.I, KeyCombination.CONTROL_DOWN));
        about.setOnAction((e) -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("About NotePad");
            alert.setHeaderText("Java Fx NotePad");
            alert.setContentText("JavaFx\nVersion 1.1.1\n@ITI Coperation, All Right Reserved");
            alert.show();
        });

        setTop(menuBar);

        BorderPane.setAlignment(textArea, javafx.geometry.Pos.CENTER);
        textArea.setPrefHeight(200.0);
        textArea.setPrefWidth(200.0);
        textArea.setPrefColumnCount(150);
        textArea.setPrefRowCount(50);
        setCenter(textArea);

        fileMenu.getItems().add(newFile);
        fileMenu.getItems().add(openFile);
        fileMenu.getItems().add(saveFile);
        fileMenu.getItems().add(separatorMenuItem);
        fileMenu.getItems().add(exitItem);
        menuBar.getMenus().add(fileMenu);
        editMenu.getItems().add(menuUndo);
        editMenu.getItems().add(separatorMenuItem0);
        editMenu.getItems().add(cutText);
        editMenu.getItems().add(copyText);
        editMenu.getItems().add(pasteText);
        editMenu.getItems().add(deleteText);
        editMenu.getItems().add(separatorMenuItem1);
        editMenu.getItems().add(selectAllText);
        menuBar.getMenus().add(editMenu);
        menuAbout.getItems().add(about);
        menuBar.getMenus().add(menuAbout);

    }
}
