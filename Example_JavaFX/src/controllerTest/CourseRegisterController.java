package controllerTest;

import viewTest.AdminFunctionView;
import viewTest.AdminLoginView;
import viewTest.CourseRegisterView;
import viewTest.StaffLoginView;
import viewTest.StudentLoginView;

public class CourseRegisterController {
    private CourseRegisterView courseRegisterView;
    private AdminLoginView adminLoginView;
    private StaffLoginView staffLoginView;
    private StudentLoginView studentLoginView;
    private AdminFunctionView adminFunctionView;
    
    public CourseRegisterController(CourseRegisterView courseRegisterView) {
        this.courseRegisterView = courseRegisterView;
    }

    public void handleAdminLogin(){
        adminLoginView = new AdminLoginView(this);
        adminLoginView.showLoginView();
    }

    public void handleStaffLogin (){
        staffLoginView = new StaffLoginView(this);
        staffLoginView.showLoginView();
    }

    public void handleStudentLogin (){
        studentLoginView = new StudentLoginView(this);
        studentLoginView.showLoginView();
    }

    public void handleAdminAfterLogin(String username, String password){
        if(username.equals("admin") && password.equals("admin001")){
            showInformation("Admin login successful!");
            adminLoginView.closeLoginWindow();
            adminFunctionView = new AdminFunctionView(this);
        }
        else{
            showInformation("Please try again!");
        }
    }

    public void handleStaffAfterLogin (String username, String password){
        showInformation("Welcome " + username);
        staffLoginView.closeLoginWindow();
    }

    public void handleStudentAfterLogin(String username, String password){
        showInformation("Welcome " + username);
        studentLoginView.closeLoginWindow();
    }

    public void handleAdminFunction (){
        
    }


    public void showInformation(String message) {
        courseRegisterView.showAlert(message);
    }

}
