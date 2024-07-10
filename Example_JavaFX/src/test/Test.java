package test;

import controller.RegistrationController;
import javafx.application.Application;
import javafx.stage.Stage;
import view.RegistrationView;

public class Test extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        RegistrationView registrationView = new RegistrationView();
        RegistrationController registrationController = new RegistrationController(registrationView);
        registrationView.setRegistrationController(registrationController); 
        registrationController.startRegistration();
    }
}
