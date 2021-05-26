package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Scene1_Controller {

	@FXML
	TextField username;

	private Stage stage;
	private Scene scene;
	private Parent root;

	public void login(ActionEvent event) throws IOException {

		String userName = username.getText();

		// created instance of FXMLLoader to reuse it while getting the scene2controller instance
		FXMLLoader loader = new FXMLLoader(Objects.requireNonNull(getClass().getResource("Scene2.fxml")));
		root = loader.load();

		Scene2_Controller scene2_controller = loader.getController();
		scene2_controller.displayName(userName);

		scene = new Scene(root);
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.setScene(scene);
		stage.show();
	}
}
