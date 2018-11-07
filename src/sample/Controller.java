package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class Controller {

    @FXML
    private TextField display;
    @FXML
    private  TextArea textArea;


    public void command(ActionEvent actionEvent) {
        String s = display.getText();
        textArea.appendText(s + "\n");
        display.clear();
        display.getCursor();
    }
}
