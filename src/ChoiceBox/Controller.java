package ChoiceBox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
	@FXML
	private Label myLabel;

	// ChoiceBox is a raw type so add the type you will populate it with
	@FXML
	private ChoiceBox<String> choiceBox;

	private String[] food = {
			"sushi",
			"burger",
			"ramen"
	};

	// implement some work after the root element has already been declared
	// using this since fxml don't add the items to the choiceBox and can't link a method to it
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		choiceBox.getItems().addAll(food); // addAll takes a collection
		choiceBox.setOnAction(this::showFood); // this:: is a method reference operator
	}

	public void showFood(ActionEvent event) {
		String selected_item = choiceBox.getValue();
		myLabel.setText(selected_item);
	}
}
