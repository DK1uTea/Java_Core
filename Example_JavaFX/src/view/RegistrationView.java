package view;

import java.util.ArrayList;

import controller.RegistrationController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Person;

public class RegistrationView {
    private RegistrationController registrationController;

    public RegistrationView() {
        this.registrationController = new RegistrationController(this);
    }

    public void showRoleSelectionView() {
        Stage stage = new Stage();
        stage.setTitle("Role Selection");

        Button staffButton = new Button("You are Staff");
        Button studentButton = new Button("You are Student");

        VBox layout = new VBox(10);
        layout.getChildren().addAll(staffButton, studentButton);

        Scene scene = new Scene(layout, 300, 200);

        staffButton.setOnAction(e -> {
            registrationController.showRegistrationView("staff");
            stage.close();
        });

        studentButton.setOnAction(e -> {
            registrationController.showRegistrationView("student");
            stage.close();
        });

        stage.setScene(scene);
        stage.show();
    }

    public void showRegistrationView(String role) {
        Stage stage = new Stage();
        stage.setTitle("Registration Form");

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10, 10, 10, 10));

        TextField fullNameField = new TextField();
        fullNameField.setPromptText("Full Name");

        TextField idField = new TextField();
        idField.setPromptText("ID");

        TextField emailField = new TextField();
        emailField.setPromptText("Email");

        TextField courseIdField = new TextField();
        courseIdField.setPromptText("Course ID");

        TextField courseNameField = new TextField();
        courseNameField.setPromptText("Course Name");

        Button registerButton = new Button("Register");
        registerButton.setOnAction(e -> {
            String fullName = fullNameField.getText();
            String id = idField.getText();
            String email = emailField.getText();
            String courseId = courseIdField.getText();
            String courseName = courseNameField.getText();

            if (!fullName.isEmpty() && !id.isEmpty() && !email.isEmpty() && !courseId.isEmpty() && !courseName.isEmpty()) {
                registrationController.registerPerson(role, fullName, id, email, courseId, courseName);
                stage.close();
            } else {
                showAlert("Please fill in all fields");
            }
        });

        Button showStudentDataButton = new Button("Show Student Data");
        Button showStaffDataButton = new Button("Show Staff Data");

        Label studentDataLabel = new Label();
        Label staffDataLabel = new Label();

        TableView<Person> tableView = new TableView<>();

        TableColumn<Person, String> fullNameCol = new TableColumn<>("Full Name");
        fullNameCol.setCellValueFactory(new PropertyValueFactory<>("fullName"));

        TableColumn<Person, String> idCol = new TableColumn<>("ID");
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));

        TableColumn<Person, String> emailCol = new TableColumn<>("Email");
        emailCol.setCellValueFactory(new PropertyValueFactory<>("email"));

        TableColumn<Person, String> courseIdCol = new TableColumn<>("Course ID");
        courseIdCol.setCellValueFactory(new PropertyValueFactory<>("courseId"));

        TableColumn<Person, String> courseNameCol = new TableColumn<>("Course Name");
        courseNameCol.setCellValueFactory(new PropertyValueFactory<>("courseName"));

        tableView.getColumns().addAll(fullNameCol, idCol, emailCol, courseIdCol, courseNameCol);

         showStudentDataButton.setOnAction(e -> {
            ArrayList<Person> studentRecords = registrationController.loadDatabase("student");
            ObservableList<Person> studentData = FXCollections.observableArrayList(studentRecords);
            tableView.setItems(studentData);
        });

        showStaffDataButton.setOnAction(e -> {
            ArrayList<Person> staffRecords = registrationController.loadDatabase("staff");
            ObservableList<Person> staffData = FXCollections.observableArrayList(staffRecords);
            tableView.setItems(staffData);
        });

        Button backButton = new Button("Back");
        backButton.setOnAction(e -> {
            registrationController.startRegistration(); // Hiển thị lại phần chọn role
            stage.close(); // Đóng cửa sổ hiện tại
        });

        layout.getChildren().addAll(fullNameField, idField, emailField, courseIdField, courseNameField,
                registerButton, showStudentDataButton, showStaffDataButton, tableView, backButton);

        Scene scene = new Scene(layout, 300, 250);
        stage.setScene(scene);
        stage.show();
    }

    public void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public void showRegistrationSuccess(String role) {
        showAlert(role + " registration successful!");
    }

    public RegistrationController getRegistrationController() {
        return registrationController;
    }

    public void setRegistrationController(RegistrationController registrationController) {
        this.registrationController = registrationController;
    }
}
