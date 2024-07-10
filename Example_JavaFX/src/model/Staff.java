package model;

import java.io.Serializable;

public class Staff implements Serializable{
    private String fullName;
    private String staffId;
    private String email;
    private String courseId;
    private String courseName;

    public Staff(String fullName, String staffId, String email, String courseId, String courseName) {
        this.fullName = fullName;
        this.staffId = staffId;
        this.email = email;
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    
}
