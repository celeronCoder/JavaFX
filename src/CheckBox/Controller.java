package CheckBox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {
	@FXML
	ImageView imageContainer;
	@FXML
	CheckBox checkBoxBtn;
	@FXML
	Label indicator;

	private Boolean on = false;

	Image bulbOFF = new Image(getClass().getResourceAsStream("bulb_off.png"));
	Image bulbON = new Image(getClass().getResourceAsStream("bulb_on.png"));

	public void toggleBulb(ActionEvent event) {
		if (on == false) {
			on = true;
			imageContainer.setImage(bulbON);
			indicator.setText("ON");
		} else {
			on = false;
			imageContainer.setImage(bulbOFF);
			indicator.setText("OFF");
		}
	}
}
