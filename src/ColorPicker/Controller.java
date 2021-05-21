package ColorPicker;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

public class Controller {
	@FXML
	private AnchorPane background;
	@FXML
	private ColorPicker picker;

	public void changeBackground() {
		Color color_picked = picker.getValue();
		background.setBackground(new Background(new BackgroundFill(color_picked, CornerRadii.EMPTY, Insets.EMPTY)));
	}
}
