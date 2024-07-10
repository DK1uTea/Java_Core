package model;

import java.io.Serializable;

public class Student implements Serializable{
    private String fullName;
    private String studentId;
    private String email;
    private String courseId;
    private String courseName;

    public Student(String fullName, String studentId, String email, String courseId, String courseName) {
        this.fullName = fullName;
        this.studentId = studentId;
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

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
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
