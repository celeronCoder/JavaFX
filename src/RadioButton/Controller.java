package RadioButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class Controller {
	@FXML
	Label label;
	@FXML
	RadioButton btnPizza, btnBurger, btnPasta;

	public void setFav() {
		if (btnPizza.isSelected()) {
			label.setText(btnPizza.getText());
		}
		else if (btnBurger.isSelected()) { label.setText(btnBurger.getText()); }
		else { label.setText(btnPasta.getText()); }
	}

}
