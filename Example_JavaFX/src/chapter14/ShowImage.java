package chapter14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ShowImage extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new HBox(10);
        pane.setPadding(new Insets(5, 5, 5, 5));

        // Load the image from the file
        Image image = new Image("file:C:\\Users\\dqtit\\OneDrive\\Hình ảnh\\StarIdol.jpg");

        // Calculate the size of the window
        double windowWidth = 800; // You can change this as needed
        double windowHeight = 600; // You can change this as needed

        // Calculate the scaling factor to fit the image within the window
        double scale = Math.min(windowWidth / image.getWidth(), windowHeight / image.getHeight());

        // Create an ImageView with the scaled image
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(image.getWidth() * scale);
        imageView.setFitHeight(image.getHeight() * scale);

        // Add the scaled image to the pane
        pane.getChildren().add(imageView);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("ShowImage");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
