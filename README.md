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
