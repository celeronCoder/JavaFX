package scene;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        Group root = new Group();
        Scene scene = new Scene(root);
        scene.setFill(Color.MEDIUMAQUAMARINE);

        Text text = new Text();
        text.setText("Shapes with Scenes");
        text.setFont(Font.font("Verdana", 25));
        text.setFill(Color.INDIANRED);
        text.setX(100);
        text.setY(100);
        root.getChildren().add(text);

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(100);
        rectangle.setWidth(100);
        rectangle.setX(200);
        rectangle.setY(200);
        rectangle.setFill(Color.AQUA);
        rectangle.setOpacity(0.9);
        rectangle.setStroke(Color.FLORALWHITE);
        rectangle.setStrokeWidth(5);
        rectangle.setRotate(90);
        root.getChildren().add(rectangle);

        Line line = new Line();
        line.setStartX(300);
        line.setEndX(400);
        line.setStartY(400);
        line.setEndY(400);
        line.setStrokeWidth(10);
        line.setStroke(Color.LIME);
        line.setOpacity(0.87);
        root.getChildren().add(line);

        Polygon triangle = new Polygon();
        triangle.getPoints().addAll(
                200.0, 600.0,
                300.0, 400.0,
                400.0, 600.0
        );
        triangle.setFill(Color.SILVER);
        triangle.setStroke(Color.BLACK);
        root.getChildren().add(triangle);

        Circle circle = new Circle();
        circle.setCenterX(300);
        circle.setCenterY(300);
        circle.setRadius(100.0);
        circle.setFill(Color.BLACK);
        circle.setStroke(Color.AZURE);
        root.getChildren().add(circle);

        // adding an image to the screen
        Image pizza = new Image("pizza.png");
        ImageView pizzaView = new ImageView(pizza);
        pizzaView.setX(200);
        pizzaView.setY(200);
        root.getChildren().add(pizzaView);

        stage.setHeight(700);
        stage.setWidth(600);
        stage.setResizable(false);
        stage.setX(50);
        stage.setX(50);
        stage.setTitle("Shapes with Scenes");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
