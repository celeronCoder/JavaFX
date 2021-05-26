package Spinner;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
	@FXML
	private Spinner<Integer> foodSpinner;
	@FXML
	private Label spinnerLabel;

	private int currentValue;

	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		// adds the range of Integer from 1 to 10
		SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10);
		// default value
		valueFactory.setValue(1);
		foodSpinner.setValueFactory(valueFactory);
		currentValue = foodSpinner.getValue();
		spinnerLabel.setText(Integer.toString(currentValue));
		// to change the label text when the value changes we add an event listener to the valueFactory
		foodSpinner.valueProperty().addListener(new ChangeListener<Integer>() {
			@Override
			public void changed(ObservableValue<? extends Integer> observableValue, Integer integer, Integer t1) {
				currentValue = foodSpinner.getValue();
				spinnerLabel.setText(Integer.toString(currentValue));
			}
		});
	}
}

// TODO edit the VM options in the RUN Configuration of the different Packages to update it through the new location of the javaf-sdk