package modelTest;

import java.io.IOException;
import java.util.ArrayList;

public interface AdminInterface {
    public void createCourse();
    public void deleteCourse();
    public void editCourse();
    public void displayCourseInfo();
    public void registerStudent();
    public void adminViewAllCourses();
    public ArrayList<Course> viewFullCourses();
    public void writeToFile();
    public void viewRegisteredStudent();
    public void viewAllStudentCourses();
    public void sortCoursesByStudents();
}
