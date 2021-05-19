package ImageView;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Controller  {
	@FXML
	ImageView imageContainer;
	@FXML
	Button switchBtn;

	Image image1 = new Image(getClass().getResourceAsStream("building.jpg"));
	Image image2 = new Image(getClass().getResourceAsStream("building2.jpg"));

	public void toggleImage() {
		if (imageContainer.getImage() == image1) {
			imageContainer.setImage(image2);
		} else {
			imageContainer.setImage(image1);
		}
	}
}
