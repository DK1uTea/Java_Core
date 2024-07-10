package viewTest;

import controllerTest.CourseRegisterController;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import modelTest.Admin;
import modelTest.Course;

public class AdminFunctionView {
    private CourseRegisterController courseRegisterController;
    private Course course;
    private Admin admin;
    private Label infoLabel;
    
    public AdminFunctionView(CourseRegisterController courseRegisterController) {
        this.courseRegisterController = courseRegisterController;
        this.course = new Course();
        this.admin = new Admin();
        showAdminFunctionView();
    }

    public void showAdminFunctionView() {
        Stage adminFunctionsStage = new Stage();
        adminFunctionsStage.initModality(Modality.APPLICATION_MODAL);
        adminFunctionsStage.setTitle("Admin Functions");

        VBox adminFunctionsLayout = new VBox(10);
        adminFunctionsLayout.setPadding(new Insets(10, 10, 10, 10));

        infoLabel = new Label();
        infoLabel.setWrapText(true); // Allows text to wrap to the next line
        adminFunctionsLayout.getChildren().add(infoLabel);

        Button createCourseButton = new Button("Create Course");
        createCourseButton.setOnAction(e -> courseRegisterController.handleAdminFunction());

        Button deleteCourseButton = new Button("Delete Course");
        deleteCourseButton.setOnAction(e -> courseRegisterController.handleAdminFunction());

        Button editCourseButton = new Button("Edit Course");
        editCourseButton.setOnAction(e -> courseRegisterController.handleAdminFunction());

        Button displayCourseInfoButton = new Button("Display Course Info");
        displayCourseInfoButton.setOnAction(e -> courseRegisterController.handleAdminFunction());

        Button registerStudentButton = new Button("Register Student");
        registerStudentButton.setOnAction(e -> courseRegisterController.handleAdminFunction());

        Button viewAllCoursesButton = new Button("View All Courses");
        viewAllCoursesButton.setOnAction(e -> courseRegisterController.handleAdminFunction());

        Button viewFullCoursesButton = new Button("View Full Courses");
        viewFullCoursesButton.setOnAction(e -> courseRegisterController.handleAdminFunction());

        Button writeToFileButton = new Button("Write to File");
        writeToFileButton.setOnAction(e -> courseRegisterController.handleAdminFunction());

        Button viewRegisteredStudentButton = new Button("View Registered Student");
        viewRegisteredStudentButton.setOnAction(e -> courseRegisterController.handleAdminFunction());

        Button viewAllStudentCoursesButton = new Button("View All Student Courses");
        viewAllStudentCoursesButton.setOnAction(e -> courseRegisterController.handleAdminFunction());

        Button sortCoursesByStudentsButton = new Button("Sort Courses By Students");
        sortCoursesByStudentsButton.setOnAction(e -> courseRegisterController.handleAdminFunction());

        adminFunctionsLayout.getChildren().addAll(
            createCourseButton, deleteCourseButton, editCourseButton,
            displayCourseInfoButton, registerStudentButton,
            viewAllCoursesButton, viewFullCoursesButton, writeToFileButton,
            viewRegisteredStudentButton, viewAllStudentCoursesButton,
            sortCoursesByStudentsButton
        );


        Scene adminFunctionsScene = new Scene(adminFunctionsLayout, 300, 400);
        adminFunctionsStage.setScene(adminFunctionsScene);
        adminFunctionsStage.showAndWait();
    }
    
    
}
