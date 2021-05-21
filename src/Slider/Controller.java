package Slider;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
	@FXML
	private Slider temperatureSlider;
	@FXML
	private Label tempLabel;

	private int temperature;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		temperatureSlider.valueProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
				temperature = (int) temperatureSlider.getValue();
				tempLabel.setText(Integer.toString(temperature)+ "C");
			}
		});
	}
}
