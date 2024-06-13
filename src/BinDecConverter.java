import controller.ConverterController;
import javafx.application.Application;
import javafx.stage.Stage;
import view.ConverterView;

import java.util.logging.FileHandler;

public class BinDecConverter extends Application {
 

    private ConverterView view;
    private ConverterController controller;

    public BinDecConverter() {
        view = new ConverterView();
        controller = new ConverterController(view);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(view.getMainScene());
        primaryStage.setTitle("Binary 2 Decimal Converter");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
