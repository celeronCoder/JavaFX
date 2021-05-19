package exit;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	// to show alert when hit the close button or Alt+F4
	public void exit(Stage stage) {
		Alert exit_alert = new Alert(Alert.AlertType.CONFIRMATION);
		exit_alert.setTitle("Logout");
		exit_alert.setHeaderText("You are about to logout");
		exit_alert.setContentText("Are you sure you want to exit.");

		// only exit if the alert is opted OK
		if (exit_alert.showAndWait().get() == ButtonType.OK) {
			System.out.println("You successfully logged out of the window");
			stage.close();
		}
	}

	@Override
	public void start(Stage stage) throws Exception {
		try {
			Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Main.fxml")));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.setTitle("Exiting the GUI");
			stage.show();
			stage.setOnCloseRequest(event -> {
				event.consume();
				exit(stage);
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
