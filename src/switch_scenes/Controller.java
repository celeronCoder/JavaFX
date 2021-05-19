package switch_scenes;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Controller {
	private Stage stage;
	private Scene scene;
	private Parent root;

	public void switchToScene1(ActionEvent event) throws IOException {
		try {
			root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Scene1.fxml")));

			/*
			* Type Casting means assigning the value of one data type to the other
			* Here event.getSource() is casted to a Node and,
			* ((Node)event.getSource()).getScene().getWindow() is casted to a Stage
			*/

			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void switchToScene2(ActionEvent event) throws IOException {
		try {
			Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Scene2.fxml")));

			/*
			getting the source of the event and casting it to a Node and then with method chaining
			.getScene().getWindow() and then casting all this to a Stage.
			*/

			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
