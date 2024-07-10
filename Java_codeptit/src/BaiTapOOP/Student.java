package BaiTapOOP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Student extends User implements StudentInterface, java.io.Serializable{
    public Student (){
        
    }
    
    public Student(String firstName, String midName, String lastName){
        super(firstName, midName, lastName);
    }
    @Override
    public void viewAllCourses() {
        for(int i =0 ; i<courseList.size(); i++){
            courseList.get(i).studentPrint();
        }
    }

    @Override
    public void viewOpenCourses() {
        for (int i = 0; i < courseList.size(); i++) {
			if (courseList.get(i).getCurrentStudents() != courseList.get(i).getMaxStudents()) {
				courseList.get(i).studentPrint();
			}
		}
    }

    @Override
    public void registerInCourse(){
        Scanner sc = new Scanner(System.in);

		System.out.println("Enter the course name: ");
		String courseName = sc.nextLine();
		System.out.println("Enter the course ID: ");
		String courseID = sc.nextLine();
		System.out.println("Enter your first name: ");
		String firstName = sc.next();
        System.out.println("Enter your middle name: ");
        String midName = sc.next();
		System.out.println("Enter your last name: ");
		String lastName = sc.next();

		for (int i = 0; i < courseList.size(); i++) {
			if (courseList.get(i).getCourseName() == courseName && courseList.get(i).getCourseID() == courseID) {
				Student student = new Student(firstName, midName, lastName);
				courseList.get(i).studentList.add(student);
				System.out.println("You have been successfully added to the course!");
			}
		}
    }

    @Override
    public void withDrawFromCourse(){
        Scanner sc = new Scanner(System.in);

		System.out.println("Enter the course name: ");
		String courseName = sc.nextLine();
		System.out.println("Enter your first name: ");
		String firstName = sc.next();
        System.out.println("Enter your middle name: ");
        String midName = sc.next();
		System.out.println("Enter your last name: ");
		String lastName = sc.next();

		for (int i = 0; i < courseList.size(); i++) {
			if (courseList.get(i).getCourseName() == courseName) {
				Student student = new Student(firstName, midName, lastName);
				courseList.get(i).studentList.remove(student);
				System.out.println("You have been successfully removed from the course!");
			}
		}
    }

    @Override
    public void viewRegisteredCourses(){
        Scanner sc = new Scanner(System.in);

		System.out.println("Enter your first name: ");
		String firstName = sc.next();
        System.out.println("Enter your middle name: ");
        String midName = sc.next();
		System.out.println("Enter your last name: ");
		String lastName = sc.next();

        Student st = new Student(firstName, midName, lastName);
        for(int i = 0; i<courseList.size(); i++){
            if(courseList.get(i).studentList.contains(st)){
                courseList.get(i).studentPrint();
            }
        }
    }
    
}
