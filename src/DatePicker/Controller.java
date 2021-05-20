package DatePicker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Controller {
	@FXML
	private DatePicker datePicker;
	@FXML
	private Label date;

	public void selectDate(ActionEvent e) {
		LocalDate myDate = datePicker.getValue();
		String formattedDate = myDate.format(DateTimeFormatter.ofPattern("dd-MM-yyy"));
		date.setText(formattedDate.toString());
	}
}
