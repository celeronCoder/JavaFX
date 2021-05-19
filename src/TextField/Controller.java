package TextField;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
	@FXML
	private Label message;
	@FXML
	private TextField myTextField;

	int age;

	public void submit() {
		 try {
			age = Integer.parseInt(myTextField.getText());
			if (age >= 18) {
				message.setText("You are now signed up!");
			} else {
				message.setText("You must be 18 or above to sign up,\n come back later.");
				myTextField.setText("");
			}
		 } catch (NumberFormatException e) {
			 message.setText("Enter only Number Please.");
			 myTextField.setText("");
		 } catch (Exception e) {
		 	e.printStackTrace();
		 	message.setText("Error");
		 }
	}
}
