# JavaFX
`A repo including all the core concepts of JavaFX`

## What is JavaFX?
JavaFX is a GUI(Graphical User Interface) Library in Java similar to core GUI Library Swing.

## Topics Covered
- Scene
- Scene Builder
- Switching Scenes within a Stage
	- typecasting to switch scenes
		```java
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		```
- Using CSS Styling with Scenes
	- adding css stylesheet to the scene
		```java
		scene.getStylesheets().add(getClass().getResource("Main.css").toExternalForm());
		```
	- reusing stylesheet to use in different scenes
		```java
		String css = this.getClass().getResource("Main.css").toExternalForm();
		scene.getStylesheets().add(css);
		```
- Communicating b/w different controllers
	- Using FXML elements within controllers
		```java
		@FXML
		TextField username;

		private Stage stage;
		private Scene scene;
		private Parent root;
		```
	- Reusing FXMLLoader Instance
		```java
		FXMLLoader loader = new FXMLLoader(Objects.requireNonNull(getClass().getResource("Scene2.fxml")));
		root = loader.load();
		```
	- Creating Instances of Other Controllers of the package
		```java
		Scene2_Controller scene2_controller = loader.getController();
		```
- ImageView Node
	- How to set up ImageView Node in scenebuilder
	- Switch Images of the ImageView Node
	```java
	public void toggleImage() {
		if (imageContainer.getImage() == image1) {
			imageContainer.setImage(image2);
		} else {
			imageContainer.setImage(image1);
		}
	}
	```
- TextField Node
- CheckBoxes
- RadioButtons
	- Make sure to put all the radio-buttons in the same toggle group variable in the fxml file
		```fxml
		<toggleGroup>
            <ToggleGroup fx:id="food" />
         </toggleGroup>
		```
- Color Picker
	- How to set the background of the AnchorPane(`javafx.scene.layout.AnchorPane`) with Color(`javafx.scene.paint.Color`)
		```java
		AnchorPane background;
		Color color = Color.RED;
		background.setBackground(new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY)));
		// or 
		background.setBackground(new Background(new BackgroundFill(color, null, null)));
		```
- Choice Boxes
	- How to set the items of a choicebox and set the action event method
		- To add anything to the nodes after the root node has been declared with the FXML File we can use the intialize method as 
			```java
			public class Controller implements Initializable {
				@Override
				public void initialize(URL arg0, ResourceBundle arg1) {
					// do something
				}
			}
			```
		- Adding items to the choicebox
			```java
				private String[] food = {
					"sushi",
					"burger",
					"ramen"
				};
				
				@Override
				public void initialize(URL arg0, ResourceBundle arg1) {
					choiceBox.getItems().addAll(food); // addAll takes a collection
				}
			```
		- setting the onAction event of choicebox or any node
			```java
			@FXML
			private ChoiceBox<String> choiceBox;
			@Override
			public void initialize(URL arg0, ResourceBundle arg1) {
				choiceBox.setOnAction(this::showFood); // this:: is a method reference operator
			}
			```
