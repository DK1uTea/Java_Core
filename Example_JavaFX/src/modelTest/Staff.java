package modelTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Staff extends User implements StaffInterface, java.io.Serializable{

    public Staff (){

    }
    
    public Staff (String firstName, String midName, String lastName){
        super(firstName, midName, lastName);
    }

    @Override
    public void viewAllCourses() {
        for (int i = 0; i<courseList.size(); i++){
            courseList.get(i).studentPrint();
        }
    }

    @Override
    public void registerInCourse() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the course name: ");
        String courseName = sc.nextLine();
        System.out.println("Enter the course section number: ");
        int courseSection = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your first name: ");
        String firstName = sc.next();
        System.out.println("Enter your middle name: ");
        String midName = sc.next();
        System.out.println("Enter your last name: ");
        String lastName = sc.next();
        String instructorName = firstName + " " + midName + " " + lastName;
        for(int i = 0; i< courseList.size(); i++){
            if(courseList.get(i).getCourseName() == courseName && courseList.get(i).getCourseSection() == courseSection){
                courseList.get(i).setInstructorName(instructorName);
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
        String instructorName = firstName + " " + midName + " " + lastName;
        for(int i = 0; i< courseList.size(); i++){
            if(courseList.get(i).getCourseName() == courseName && courseList.get(i).getInstructorName() == instructorName){
                courseList.get(i).setInstructorName("");
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
        String instructorName = firstName + " " + midName + " " + lastName;

        for(int i = 0; i<courseList.size(); i++){
            if(courseList.get(i).getInstructorName() == instructorName){
                courseList.get(i).studentPrint();
            }
        }
        
    }
    
}
