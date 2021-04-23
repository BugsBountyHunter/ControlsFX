package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Label helloWorldLbl;

    public void onButtonClicked(ActionEvent event){
        helloWorldLbl.setText("Clicked Button Clicked!");
        System.out.println("You Clicked Button" + event.getTarget());
    }
}
