package viewTest;

import controllerTest.CourseRegisterController;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AdminLoginView {
    private CourseRegisterController courseRegisterController;
    private Stage stage;

    public AdminLoginView(CourseRegisterController courseRegisterController) {
        this.courseRegisterController = courseRegisterController;
    }

    public void showLoginView(){
        stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Admin Login");

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(8);
        gridPane.setHgap(10);

        Label usernameLabel = new Label("Username:");
        GridPane.setConstraints(usernameLabel, 0, 0);

        TextField usernameInput = new TextField();
        GridPane.setConstraints(usernameInput, 1, 0);

        Label passwordLabel = new Label("Password:");
        GridPane.setConstraints(passwordLabel, 0, 1);

        TextField passwordInput = new PasswordField();
        GridPane.setConstraints(passwordInput, 1, 1);

        Button loginButton = new Button("Login");
        GridPane.setConstraints(loginButton, 1, 2);
        loginButton.setOnAction(e -> courseRegisterController.handleAdminAfterLogin(usernameInput.getText(), passwordInput.getText()));

        gridPane.getChildren().addAll(usernameLabel, usernameInput, passwordLabel, passwordInput, loginButton);

        Scene scene = new Scene(gridPane, 300, 150);
        stage.setScene(scene);
        stage.showAndWait();
    }

    public void closeLoginWindow() {
        stage.close(); // Đóng cửa sổ đăng nhập
    }
}
