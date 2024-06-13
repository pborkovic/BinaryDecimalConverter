package view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class ConverterView {
    private Label decimalLabel;
    private Label binaryLabel;
    private TextField decimalTextfield;
    private TextField binaryTextfield;
    private Button convert2BinaryButton;
    private Button convert2DecimalButton;
    private Text headline;
    private Scene mainScene;

    public ConverterView() {
        decimalLabel = new Label("Decimal: ");
        binaryLabel = new Label("Binary: ");
        decimalTextfield = new TextField();
        binaryTextfield = new TextField();
        convert2BinaryButton = new Button("Convert 2 Binary");
        convert2DecimalButton = new Button("Convert 2 Decimal");
        headline = new Text("Binary 2 Decimal - Converter");
        createMainScene();
    }

    private void createMainScene(){
        VBox leftVbox = new VBox(16, decimalLabel, binaryLabel);
        leftVbox.setAlignment(Pos.CENTER);

        VBox midVbox = new VBox(5, decimalTextfield, binaryTextfield);
        midVbox.setAlignment(Pos.CENTER);

        VBox rightVbox = new VBox(5, convert2BinaryButton, convert2DecimalButton);
        rightVbox.setAlignment(Pos.CENTER);

        HBox hBox = new HBox(10, leftVbox, midVbox, rightVbox);
        hBox.setAlignment(Pos.CENTER);

        VBox root = new VBox(10, headline, hBox);
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-padding: 20px");

        mainScene = new Scene(root);
    }

    //Getters damit alles Verwendet werden kann
    public TextField getDecimalTextfield() {
        return decimalTextfield;
    }

    public TextField getBinaryTextfield() {
        return binaryTextfield;
    }

    public Button getConvert2BinaryButton() {
        return convert2BinaryButton;
    }

    public Button getConvert2DecimalButton() {
        return convert2DecimalButton;
    }

    public Scene getMainScene() {
        return mainScene;
    }
}
