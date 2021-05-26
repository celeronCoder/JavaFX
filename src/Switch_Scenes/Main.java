package Switch_Scenes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		try {
			Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Scene1.fxml")));
			Scene scene1 = new Scene(root);
			stage.setTitle("Change From one Scene To other.");
			stage.setScene(scene1);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
