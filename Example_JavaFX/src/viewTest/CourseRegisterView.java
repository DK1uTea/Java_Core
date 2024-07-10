package viewTest;

import controllerTest.CourseRegisterController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CourseRegisterView extends Application{
    private CourseRegisterController courseRegisterController;
    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        primaryStage.setTitle("Course Registration System");

        VBox root = new VBox(10);

        Button adminButton = new Button("Login as Admin");
        Button staffButton = new Button("Login as Staff");
        Button studentButton = new Button("Login as Student");
        Button exitButton = new Button("Exit");

        // Create an instance of the controller
        courseRegisterController = new CourseRegisterController(this);

        adminButton.setOnAction(e -> courseRegisterController.handleAdminLogin());
        staffButton.setOnAction(e -> courseRegisterController.handleStaffLogin());
        studentButton.setOnAction(e -> courseRegisterController.handleStudentLogin());
        exitButton.setOnAction(e -> System.exit(0));

        root.getChildren().addAll(adminButton, staffButton, studentButton, exitButton);

        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
