package chapter16;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class TextAreaDemo extends Application{
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Declare and create a description pane
        DescriptionPane descriptionPane = new DescriptionPane();

        // Set title, text, and image in the description pane
        descriptionPane.setTitle("Canada");
        String description = "The Canadian national flag ... ";
        descriptionPane.setImageView(new ImageView("file:C:\\Users\\dqtit\\OneDrive\\Hình ảnh\\co canada.jpg"));
        descriptionPane.setDescription(description);

        // Create a scene and place it in the stage
        Scene scene = new Scene(descriptionPane, 450, 200);
        primaryStage.setTitle("TextAreaDemo"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}
