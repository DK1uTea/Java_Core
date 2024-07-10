package model;

import java.io.Serializable;

public class Person implements Serializable{
    private String fullName;
    private String id;
    private String email;
    private String courseId;
    private String courseName;

    public Person(String fullName, String id, String email, String courseId, String courseName) {
        this.fullName = fullName;
        this.id = id;
        this.email = email;
        this.courseId = courseId;
        this.courseName = courseName;
    }

    // Getters and setters

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
