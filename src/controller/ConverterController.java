package controller;

import javafx.scene.control.Alert;
import model.BinaryDecimal;
import view.ConverterView;

public class ConverterController {
    private ConverterView view;

    public ConverterController(ConverterView view) {
        this.view = view;

        //Definieren der Ereignisbehandler --> Mit Lambda Expression
        view.getConvert2DecimalButton().setOnAction(event -> {
           onConvert2Decimal();
        });

        view.getConvert2BinaryButton().setOnAction(event -> {
            onConvert2Binary();
        });
    }

    public void onConvert2Decimal(){
        try {
            String binaryText = view.getBinaryTextfield().getText();
            String decimalText = BinaryDecimal.convert2Dec(binaryText);
            view.getDecimalTextfield().setText(decimalText);
        }
        catch (NumberFormatException e){
            e.printStackTrace();
            printError(view.getBinaryTextfield().getText() +" Ist keine Binärzahl, nur Binärzahlen du Mastsack!");
            view.getBinaryTextfield().setText("");
        }

    }
    public void onConvert2Binary(){
        try {
            view.getBinaryTextfield().setText(BinaryDecimal.convert2Bin(view.getDecimalTextfield().getText()));
        }
        catch (NumberFormatException e ){
            e.printStackTrace();
            printError(view.getDecimalTextfield().getText() +" Ist keine Dezimalzahl, nur Dezimalzahlen, Kannst du lesen, Hurensohn!");
            view.getDecimalTextfield().setText("");
        }


    }

    private void printError(String errorText){
        Alert alert = new Alert(Alert.AlertType.ERROR, errorText);
        alert.showAndWait();
    }


}
