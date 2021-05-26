package ExitWindow;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller {
	@FXML
	private Button logoutBtn;
	// AnchorPane requires separate @FXML notation
	@FXML
	private AnchorPane main;

	private Stage stage;

	public void logout(ActionEvent event) {

		Alert exit_alert = new Alert(Alert.AlertType.CONFIRMATION);
		exit_alert.setTitle("Logout");
		exit_alert.setHeaderText("You are about to logout");
		exit_alert.setContentText("Are you sure you want to exit.");

		// only exit if the alert is opted OK
		if (exit_alert.showAndWait().get() == ButtonType.OK) {
			stage = (Stage) main.getScene().getWindow();
			System.out.println("You successfully logged out of the window");
			stage.close();
		}
	}
}
